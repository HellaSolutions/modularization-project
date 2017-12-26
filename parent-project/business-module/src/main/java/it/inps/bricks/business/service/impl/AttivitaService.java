package it.inps.bricks.business.service.impl;

import java.util.List;

/**
 * Service class for domain model class Attivita.
 * @see it.inps.bricks.model.Attivita
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.business.service.IAttivitaService;
import it.inps.bricks.model.Attivita;
import it.inps.bricks.model.Task;
import it.inps.bricks.persistence.dao.AttachmentDao;
import it.inps.bricks.persistence.dao.AttivitaDao;
import it.inps.bricks.persistence.dao.TaskDao;

@Service("attivitaService")
@Transactional
public class AttivitaService implements IAttivitaService {

	private static final Logger log = LoggerFactory.getLogger(AttivitaService.class);

	AttivitaDao attivitaDao;
	AttachmentDao attachmentDao;
	TaskDao taskDao;

	@Autowired
	public void setAttivitaDao(AttivitaDao attivitaDao) {
		this.attivitaDao = attivitaDao;
	}

	@Autowired
	public void setAttachmentDao(AttachmentDao attachmentDao) {
		this.attachmentDao = attachmentDao;
	}

	@Autowired
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	@Override
	public void save(Attivita attivita) {
		attivitaDao.update(attivita);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Attivita> getAll() {
		return attivitaDao.list();
	}

	@Override
	public boolean addTask(Attivita attivita, Task task) {

		if (attivitaDao.getResidualEffort(attivita) < task.getEffort()) {
			return false;
		}
		task.setAttivita(attivita);
		taskDao.add(task);
		return true;
		
	}
}
