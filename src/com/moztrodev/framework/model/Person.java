/**
 * 
 */
package com.moztrodev.framework.model;

import java.util.Date;

/**
 * @author DANIEL
 * 
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Date birthday;
	private Address address;
	private char genre;
	private BO nationality;
	
	public Person(){
		super();
	}
	
	public Person(String _firstName, String _lastName){
		setFirstName(_firstName);
		setLastName(_lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}
	
	public BO getNationality(){
		return nationality;
	}
	
	public void setNationality(BO nationality){
		this.nationality = nationality;
	}
}
