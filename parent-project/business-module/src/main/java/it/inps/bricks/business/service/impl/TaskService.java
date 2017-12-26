package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class Task.
 * @see it.inps.bricks.model.Task
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.TaskDao;

@Service("taskService")
@Transactional
public class TaskService {
	
	private static final Logger log = LoggerFactory.getLogger(TaskService.class);

	@SuppressWarnings("unused")
	private	TaskDao taskDao;

	@Autowired
	public void setTaskDao(TaskDao taskDao){
		this.taskDao = taskDao;
	}
	

}


