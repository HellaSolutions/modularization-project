package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class TipoTask.
 * @see it.inps.bricks.model.TipoTask
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.TipoTaskDao;

@Service("tipoTaskService")
@Transactional
public class TipoTaskService {
	
	private static final Logger log = LoggerFactory.getLogger(TipoTaskService.class);

	private	TipoTaskDao tipoTaskDao;

	@Autowired
	public void setTipoTaskDao(TipoTaskDao tipoTaskDao){
		this.tipoTaskDao = tipoTaskDao;
	}

}
