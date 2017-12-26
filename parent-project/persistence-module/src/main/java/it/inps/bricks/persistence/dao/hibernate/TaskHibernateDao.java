package it.inps.bricks.persistence.dao.hibernate;

/**
 * Hibernate Dao object for domain model class Task.
 * @see it.inps.bricks.model.Task
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import it.inps.bricks.model.Task;
import it.inps.bricks.persistence.dao.TaskDao;
import  it.inps.bricks.model.dao.hibernate.HibernateDao;

@Repository("taskDao")
public class TaskHibernateDao extends HibernateDao<Task, java.lang.Integer> implements TaskDao{}