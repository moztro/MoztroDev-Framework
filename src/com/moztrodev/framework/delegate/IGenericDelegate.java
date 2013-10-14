/**
 * 
 */
package com.moztrodev.framework.delegate;

import java.util.List;

import com.moztrodev.framework.services.IGenericService;

/**
 * @author DANIEL
 *
 */
public class IGenericDelegate<T> {
	IGenericService<T> service;
	
	public boolean saveOrUpdate(T object){
		return service.saveOrUpdate(object);
	}
	
	public boolean delete(int id){
		return service.delete(id);
	}
	
	public T find(int id){
		return service.find(id);
	}
	
	public List<T> findAll(){
		return service.findAll();
	}
}
