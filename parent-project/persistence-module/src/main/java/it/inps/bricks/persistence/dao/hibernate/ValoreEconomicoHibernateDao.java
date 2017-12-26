package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class ValoreEconomico.
 * @see it.inps.bricks.model.ValoreEconomico
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.ValoreEconomico;
import it.inps.bricks.persistence.dao.ValoreEconomicoDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("valoreEconomicoDao")
public class ValoreEconomicoHibernateDao extends HibernateDao<ValoreEconomico, java.lang.Integer> implements ValoreEconomicoDao{}