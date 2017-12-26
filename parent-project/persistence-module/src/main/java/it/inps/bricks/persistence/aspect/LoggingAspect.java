package it.inps.bricks.persistence.aspect;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.google.common.base.Stopwatch;

@Component
@Aspect
public class LoggingAspect {

	@Autowired
	Environment env;
	
	@Value("${aspect.responsetime.enabled}")
	private boolean traceResponseTimeEnabled;

	@AfterThrowing(pointcut = "execution (* it.inps..*.*(..))", throwing = "e")
	public void afterThrowing(JoinPoint jp, Throwable e) {
		LoggerFactory.getLogger(jp.getClass()).error(e.getMessage(), e);
	}

	@Around("within(@EnableTraceTime *) && execution (public * *.*(..))")
	public Object traceResponseTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		if (traceResponseTimeEnabled){
			Stopwatch stopwatch = Stopwatch.createStarted();
			Object o = proceedingJoinPoint.proceed();
			stopwatch.stop();
			long elapsed = stopwatch.elapsed(TimeUnit.MILLISECONDS);
			LoggerFactory.getLogger(proceedingJoinPoint.getTarget().getClass()).info(proceedingJoinPoint.getSignature()
					+ " > execution time: " + elapsed + " " + TimeUnit.MILLISECONDS.toString());
			return o;
		}
		return proceedingJoinPoint.proceed();
		
	}
	
}
