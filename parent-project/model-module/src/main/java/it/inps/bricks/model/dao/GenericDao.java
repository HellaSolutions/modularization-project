package it.inps.bricks.model.dao;

import java.util.List;

/**
 * The Interface GenericDao.
 *
 * Base interface for concrete DAO Classes. Exposes CRUD methods
 *
 * @param <E>
 *            the element type
 * @param <K>
 *            the key type
 */
public interface GenericDao<E, K> {

	public void add(E entity);

	public void update(E entity);

	public void remove(E entity);

	public E find(K key);

	public List<E> list();

	public List<E> findBy(String field, Object value);

}

