package it.inps.bricks.business.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import it.inps.bricks.business.configuration.BusinessConfiguration;
import it.inps.bricks.business.service.impl.AttivitaService;
import it.inps.bricks.model.Attivita;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BusinessConfiguration.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("development")
public class AttivitaServiceTest {
	
	private static final Logger log = LoggerFactory.getLogger(AttivitaServiceTest.class);

	@Autowired
	AttivitaService attivitaService;
	
	@Test
	public void attivitaServiceTest(){
		
		List<Attivita> atts = attivitaService.getAll();
		for(Attivita a : atts){
			log.trace("Found attachment: " + a.getNomeScheda());
		}
		
	}
	
	
	
}
