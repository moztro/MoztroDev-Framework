/**
 * 
 */
package com.moztrodev.framework.dao;

import java.util.List;

/**
 * @author DANIEL
 * A generic DAO interface that should be implemented for every
 * DAO sub-class in com.moztrodev.framework.dao
 */
public interface IGenericDAO<T> {
	boolean saveOrUpdate(T object);
	boolean delete(int id);
	T find(int id);
	List<T> findAll();
}
