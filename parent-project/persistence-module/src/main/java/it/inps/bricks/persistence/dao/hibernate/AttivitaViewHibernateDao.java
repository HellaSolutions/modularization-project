package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class AttivitaView.
 * @see it.inps.bricks.model.AttivitaView
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.AttivitaView;
import it.inps.bricks.persistence.dao.AttivitaViewDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("attivitaViewDao")
public class AttivitaViewHibernateDao extends HibernateDao<AttivitaView, java.lang.Integer> implements AttivitaViewDao{}