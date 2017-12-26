package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class Attachment.
 * @see it.inps.bricks.model.Attachment
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.Attachment;
import it.inps.bricks.persistence.dao.AttachmentDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("attachmentDao")
public class AttachmentHibernateDao extends HibernateDao<Attachment, java.lang.Integer> implements AttachmentDao{}