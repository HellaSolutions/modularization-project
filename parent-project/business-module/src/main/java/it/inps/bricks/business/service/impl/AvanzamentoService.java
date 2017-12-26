package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class Avanzamento.
 * @see it.inps.bricks.model.Avanzamento
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.AvanzamentoDao;

@Service("avanzamentoService")
@Transactional
public class AvanzamentoService {
	
	private static final Logger log = LoggerFactory.getLogger(AvanzamentoService.class);

	private	AvanzamentoDao avanzamentoDao;

	@Autowired
	public void setAvanzamentoDao(AvanzamentoDao avanzamentoDao){
		this.avanzamentoDao = avanzamentoDao;
	}

}
