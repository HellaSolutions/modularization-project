package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class Avanzamento.
 * @see it.inps.bricks.model.Avanzamento
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.Avanzamento;
import it.inps.bricks.persistence.dao.AvanzamentoDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("avanzamentoDao")
public class AvanzamentoHibernateDao extends HibernateDao<Avanzamento, java.lang.Integer> implements AvanzamentoDao{}