package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class TipoContratto.
 * @see it.inps.bricks.model.TipoContratto
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.TipoContratto;
import it.inps.bricks.persistence.dao.TipoContrattoDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("tipoContrattoDao")
public class TipoContrattoHibernateDao extends HibernateDao<TipoContratto, java.lang.Integer> implements TipoContrattoDao{}