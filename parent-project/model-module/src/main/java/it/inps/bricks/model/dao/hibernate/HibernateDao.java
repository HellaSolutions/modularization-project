package it.inps.bricks.model.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import it.inps.bricks.model.dao.GenericDao;

/**
 * Basic DAO operations dependent with Hibernate's specific classes.
 *
 * @param <E>
 *            the element type
 * @param <K>
 *            the key type
 * @see SessionFactory
 */
public abstract class HibernateDao<E, K extends Serializable> implements GenericDao<E, K> {

	private SessionFactory localSessionFactory;

	/** The Pojo type. */
	protected Class<? extends E> pojoType;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void postConstruct(){
		pojoType = (Class<? extends E>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];	
	}

	/**
	 * Sets the session factory.
	 *
	 * @param sessionFactory
	 *            the new session factory
	 */
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.localSessionFactory = sessionFactory;
	}

	/**
	 * Current session.
	 *
	 * @return the session
	 */
	protected Session currentSession() {
		return localSessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hella.service.dao.GenericDao#add(java.lang.Object)
	 */
	@Override
	public void add(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hella.service.dao.GenericDao#update(java.lang.Object)
	 */
	@Override
	public void update(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hella.service.dao.GenericDao#remove(java.lang.Object)
	 */
	@Override
	public void remove(E entity) {
		currentSession().delete(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hella.service.dao.GenericDao#find(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E find(K key) {
		return (E) currentSession().get(pojoType, key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hella.service.dao.GenericDao#list()
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<E> list() {
		return currentSession().createCriteria(pojoType).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findBy(String field, Object value) {
		return currentSession().createCriteria(pojoType).add(Restrictions.eq(field, value)).list();
	}
	
}
