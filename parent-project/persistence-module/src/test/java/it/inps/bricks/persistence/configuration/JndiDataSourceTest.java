package it.inps.bricks.persistence.configuration;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.model.Attivita;
import it.inps.bricks.persistence.tests.unit.configuration.PersistenceTestConfiguration;
import it.inps.bricks.persistence.tools.PropertyReader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceTestConfiguration.class,
		PersistenceConfiguration.class }, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("integration")
public class JndiDataSourceTest {
	
	static Logger log = LoggerFactory.getLogger(JndiDataSourceTest.class);
	
	@Autowired
	Environment environment;

	@Autowired
	DataSource sqlDataSource;

	@Autowired
	SessionFactory localSessionFactory;

	@Autowired
	Environment env;
	
	@BeforeClass
	static public void beforeClass() throws Exception {

		Properties props = PropertyReader.loadPropertyFile("tests.properties");
		DataSource ds = new DriverManagerDataSource(props.getProperty("db.driver.url"),
				props.getProperty("db.driver.user"), props.getProperty("db.driver.password"));
		SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
		builder.bind("java:comp/env/" + props.getProperty("JNDI_NAME"), ds);
		builder.activate();

	}

	@Test
	public void jdbcSelectTest() throws Exception {

		Statement st = sqlDataSource.getConnection().createStatement();
		ResultSet rs = st.executeQuery("Select * from " + environment.getProperty("test.table"));
		while (rs.next()) {
			log.trace(rs.getString(environment.getProperty("test.show.field")));
		}

	}

	@Test
	@SuppressWarnings("unchecked")
	@Transactional
	public void hibernateSelectTest() throws Exception {
		
		List<Attivita> res = localSessionFactory.getCurrentSession().
				createCriteria(Attivita.class).list();
		for(Attivita a : res){
			log.trace(a.getCodiceGeco());
		}
		
	}

}
