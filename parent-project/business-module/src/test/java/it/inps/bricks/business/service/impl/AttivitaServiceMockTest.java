package it.inps.bricks.business.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import it.inps.bricks.business.test.unit.configuration.BusinessTestConfiguration;
import it.inps.bricks.model.Attivita;
import it.inps.bricks.model.Task;
import it.inps.bricks.persistence.dao.AttivitaDao;
import it.inps.bricks.persistence.dao.TaskDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BusinessTestConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class AttivitaServiceMockTest {

	@Autowired
	AttivitaService service;
	
	@Test
	public void attivitaHasEnoughEffortTest(){
		
		Attivita attivita = new Attivita();
		AttivitaDao attivitaDao = service.attivitaDao;		
		when(attivitaDao.getResidualEffort(attivita)).
			thenReturn(5);
		Task task = new Task();
		task.setEffort(4);
		TaskDao taskDao = service.taskDao;	
		assertTrue(service.addTask(attivita, task));
		
		verify(taskDao, times(1)).add(task);	
		
	}
	
	@Test
	public void attivitaDoesNotHaveEnoughEffortTest(){
		
		Attivita dummy = new Attivita();
		AttivitaDao attivitaDao = service.attivitaDao;
		when(attivitaDao.getResidualEffort(dummy)).
			thenReturn(5);
		Task task = new Task();
		task.setEffort(6);
		assertFalse(service.addTask(dummy, task));
		
	}
	
}
