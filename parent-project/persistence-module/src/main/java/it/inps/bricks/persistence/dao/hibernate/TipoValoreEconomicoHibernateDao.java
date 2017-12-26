package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class TipoValoreEconomico.
 * @see it.inps.bricks.model.TipoValoreEconomico
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.TipoValoreEconomico;
import it.inps.bricks.persistence.dao.TipoValoreEconomicoDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("tipoValoreEconomicoDao")
public class TipoValoreEconomicoHibernateDao extends HibernateDao<TipoValoreEconomico, java.lang.Integer> implements TipoValoreEconomicoDao{}