package it.inps.bricks.business.service.impl;
/**
 * Service class for domain model class DocumentoView.
 * @see it.inps.bricks.model.DocumentoView
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.persistence.dao.DocumentoViewDao;

@Service("documentoViewService")
@Transactional
public class DocumentoViewService {
	
	private static final Logger log = LoggerFactory.getLogger(DocumentoViewService.class);

	private	DocumentoViewDao documentoViewDao;

	@Autowired
	public void setDocumentoViewDao(DocumentoViewDao documentoViewDao){
		this.documentoViewDao = documentoViewDao;
	}

}
