package it.inps.bricks.persistence.tests.unit.configuration;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@PropertySource("classpath:tests.properties")
@Configuration
@EnableTransactionManagement
public class PersistenceTestConfiguration implements TransactionManagementConfigurer{
	
	static Logger log = LoggerFactory.getLogger(PersistenceTestConfiguration.class);
	
	@Autowired
	Environment env;
	
	@Autowired
	SessionFactory localSessionFactory;
	
	@PostConstruct
	void postConstruct(){
		log.trace("Spring test configuration successfully loaded");
		log.trace(env.getProperty("test.table"));
	}
	
	@Bean
	PlatformTransactionManager txManager(){
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(localSessionFactory);
		return txManager;
	}
	
	@Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txManager();
    }

}
