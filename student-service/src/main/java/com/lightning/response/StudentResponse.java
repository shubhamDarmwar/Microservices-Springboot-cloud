package com.lightning.response;

import com.lightning.entity.Student;

public class StudentResponse {

	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private long addressId;
//	private String city;
//	private String street;
	private AddressResponse addressResponse;
	
	public StudentResponse(Student s) {
		this.addressId = s.getAddress_id();
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the address
	 */
	public long getAddressId() {
		return addressId;
	}

	/**
	 * @return the addressResponse
	 */
	public AddressResponse getAddressResponse() {
		return addressResponse;
	}
	/**
	 * @param addressResponse the addressResponse to set
	 */
	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
}
