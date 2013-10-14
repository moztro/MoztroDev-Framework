/**
 * 
 */
package com.moztrodev.framework.model;

/**
 * @author DANIEL
 *
 */
public class Address {
	private String streetName;
	private String streetNumber;
	private BO city;
	private BO state;
	private String postalCode;
	
	public Address(){
		super();
	}
	
	public Address(String _streetName, String _streetNumber, BO _city, BO _state, String _postalCode){
		setStreetName(_streetName);
		setStreetNumber(_streetNumber);
		setCity(_city);
		setState(_state);
		setPostalCode(_postalCode);
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public BO getCity() {
		return city;
	}

	public void setCity(BO city) {
		this.city = city;
	}

	public BO getState() {
		return state;
	}

	public void setState(BO state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
