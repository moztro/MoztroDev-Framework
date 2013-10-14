/**
 * 
 */
package com.moztrodev.framework.model;

/**
 * @author DANIEL
 *
 */
public class BO {
	private int id;
	private String description;
	
	public BO(){
		super();
	}
	
	public BO(int _id, String _description){
		setId(_id);
		setDescription(description);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
}
