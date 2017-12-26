package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class Servizio.
 * @see it.inps.bricks.model.Servizio
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.ServizioDao;

@Service("servizioService")
@Transactional
public class ServizioService {
	
	private static final Logger log = LoggerFactory.getLogger(ServizioService.class);

	private	ServizioDao servizioDao;

	@Autowired
	public void setServizioDao(ServizioDao servizioDao){
		this.servizioDao = servizioDao;
	}

}
