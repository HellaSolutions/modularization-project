package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class DocumentoView.
 * @see it.inps.bricks.model.DocumentoView
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.DocumentoView;
import it.inps.bricks.persistence.dao.DocumentoViewDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("documentoViewDao")
public class DocumentoViewHibernateDao extends HibernateDao<DocumentoView, java.lang.Integer> implements DocumentoViewDao{}