package com.lightning.response;

import org.apache.commons.logging.Log;

import com.lightning.entity.Address;
import com.lightning.entity.Student;

public class StudentResponse {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	
	public StudentResponse(Student s) {
		this.address = s.getAddress();
		this.firstName = s.getFirstName();
		this.lastName = s.getLastName();
		this.email = s.getEmail();
		this.id = s.getId();
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
