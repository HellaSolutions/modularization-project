package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class TipoValoreEconomico.
 * @see it.inps.bricks.model.TipoValoreEconomico
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.TipoValoreEconomicoDao;

@Service("tipoValoreEconomicoService")
@Transactional
public class TipoValoreEconomicoService {
	
	private static final Logger log = LoggerFactory.getLogger(TipoValoreEconomicoService.class);

	private	TipoValoreEconomicoDao tipoValoreEconomicoDao;

	@Autowired
	public void setTipoValoreEconomicoDao(TipoValoreEconomicoDao tipoValoreEconomicoDao){
		this.tipoValoreEconomicoDao = tipoValoreEconomicoDao;
	}

}
