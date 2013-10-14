/**
 * 
 */
package com.moztrodev.framework.services;

import java.util.List;

/**
 * @author DANIEL
 *
 */
public interface IGenericService<T> {
	boolean saveOrUpdate(T object);
	boolean delete(int id);
	T find(int id);
	List<T> findAll();
}
