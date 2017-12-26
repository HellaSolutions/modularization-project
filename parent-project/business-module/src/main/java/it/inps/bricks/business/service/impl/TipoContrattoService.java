package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class TipoContratto.
 * @see it.inps.bricks.model.TipoContratto
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.TipoContrattoDao;

@Service("tipoContrattoService")
@Transactional
public class TipoContrattoService {
	
	private static final Logger log = LoggerFactory.getLogger(TipoContrattoService.class);

	private	TipoContrattoDao tipoContrattoDao;

	@Autowired
	public void setTipoContrattoDao(TipoContrattoDao tipoContrattoDao){
		this.tipoContrattoDao = tipoContrattoDao;
	}

}
