package it.inps.bricks.business.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import it.inps.bricks.persistence.configuration.PersistenceConfiguration;

@Configuration
@Import(PersistenceConfiguration.class)
@ImportResource(value = "classpath:spring-business-config.xml")
@ComponentScan(basePackages = { "it.inps.bricks.business.service" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BusinessConfiguration {}
