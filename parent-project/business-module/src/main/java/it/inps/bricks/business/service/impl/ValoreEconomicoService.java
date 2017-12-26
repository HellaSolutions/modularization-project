package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class ValoreEconomico.
 * @see it.inps.bricks.model.ValoreEconomico
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.ValoreEconomicoDao;

@Service("valoreEconomicoService")
@Transactional
public class ValoreEconomicoService {
	
	private static final Logger log = LoggerFactory.getLogger(ValoreEconomicoService.class);

	private	ValoreEconomicoDao valoreEconomicoDao;

	@Autowired
	public void setValoreEconomicoDao(ValoreEconomicoDao valoreEconomicoDao){
		this.valoreEconomicoDao = valoreEconomicoDao;
	}

}
