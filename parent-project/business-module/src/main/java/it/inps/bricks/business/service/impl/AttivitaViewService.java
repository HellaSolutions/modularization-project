package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class AttivitaView.
 * @see it.inps.bricks.model.AttivitaView
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.AttivitaViewDao;

@Service("attivitaViewService")
@Transactional
public class AttivitaViewService {
	
	private static final Logger log = LoggerFactory.getLogger(AttivitaViewService.class);

	private	AttivitaViewDao attivitaViewDao;

	@Autowired
	public void setAttivitaViewDao(AttivitaViewDao attivitaViewDao){
		this.attivitaViewDao = attivitaViewDao;
	}

}
