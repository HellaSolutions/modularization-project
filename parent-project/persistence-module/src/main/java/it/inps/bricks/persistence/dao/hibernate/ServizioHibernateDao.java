package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class Servizio.
 * @see it.inps.bricks.model.Servizio
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.Servizio;
import it.inps.bricks.persistence.dao.ServizioDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("servizioDao")
public class ServizioHibernateDao extends HibernateDao<Servizio, java.lang.Integer> implements ServizioDao{}