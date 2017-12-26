package it.inps.bricks.business.service.impl;
import java.util.List;

/**
 * Service class for domain model class Attachment.
 * @see it.inps.bricks.model.Attachment
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.inps.bricks.model.Attachment;
import it.inps.bricks.persistence.dao.AttachmentDao;

@Service("attachmentService")
@Transactional
public class AttachmentService {
	
	private static final Logger log = LoggerFactory.getLogger(AttachmentService.class);

	private	AttachmentDao attachmentDao;

	@Autowired
	public void setAttachmentDao(AttachmentDao attachmentDao){
		this.attachmentDao = attachmentDao;
	}
	
	public List<Attachment> getAll(){
		return attachmentDao.list();
	}

}
