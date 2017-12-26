package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class TipoTask.
 * @see it.inps.bricks.model.TipoTask
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.TipoTask;
import it.inps.bricks.persistence.dao.TipoTaskDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("tipoTaskDao")
public class TipoTaskHibernateDao extends HibernateDao<TipoTask, java.lang.Integer> implements TipoTaskDao{}