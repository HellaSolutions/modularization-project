package it.inps.bricks.persistence.configuration;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

@Configuration
@ImportResource(value = "classpath:spring-persistence-config.xml")
@ComponentScan(basePackages = { "it.inps.bricks.persistence.dao.hibernate", "it.inps.bricks.persistence.aspect" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PersistenceConfiguration {

	private static Logger log = LoggerFactory.getLogger(PersistenceConfiguration.class);

	@Autowired
	Environment environment;

	PersistenceConfiguration() {}

	@Bean
	public String[] profiles() {

		ArrayList<String> p = new ArrayList<String>();
		for (final String profileName : environment.getActiveProfiles()) {
			p.add(profileName);
		}
		String[] ret = new String[p.size()];
		p.toArray(ret);
		log.info("Currently active profiles - " + Arrays.toString(ret));
		return ret;

	}

	@Bean
	public BeanPostProcessor persistenceTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(PersistenceConfiguration.class);
	}

}
