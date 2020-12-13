package com.api.pakg;

public class BodyData2 {
	String firstName;
	String lastName;
	String age;
	String id;
	AddressData1 address[];
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AddressData1[] getAddress() {
		return address;
	}
	public void setAddress(AddressData1[] address) {
		this.address = address;
	}

}
