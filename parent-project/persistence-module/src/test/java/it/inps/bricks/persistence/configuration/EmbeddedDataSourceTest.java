package it.inps.bricks.persistence.configuration;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import it.inps.bricks.persistence.tests.unit.configuration.PersistenceTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceTestConfiguration.class, PersistenceConfiguration.class}, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("development")
public class EmbeddedDataSourceTest {
	
	static Logger log = LoggerFactory.getLogger(EmbeddedDataSourceTest.class);

	@Autowired
	Environment environment;
	
	@Autowired
	DataSource sqlDataSource;

	@Autowired
	SessionFactory localSessionFactory;

	@Test
	public void jdbcSelectTest() throws Exception {

		Statement st = sqlDataSource.getConnection().createStatement();
		ResultSet rs = st.executeQuery("Select * from " + environment.getProperty("test.table"));
		while (rs.next()) {
			log.trace(rs.getString(environment.getProperty("test.show.field")));
		}

	}

//	@Autowired
//	AttivitaService taskService;
//	@Test
//	@SuppressWarnings("unchecked")
//	@Transactional
//	public void hibernateSelectTest() throws Exception {
//		
//		List<Attivita> res = localSessionFactory.getCurrentSession().
//				createCriteria(Attivita.class).list();
//		for(Attivita a : res){
//			log.trace(a.getCodiceGeco());
//		}
//		
//	}

}
