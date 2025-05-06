package com.example.actuator.common;

public class Address {

	String flat;
	String street;
	String city;
	
	public Address(String flat, String street, String city) {
		super();
		this.flat = flat;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [flat=" + flat + ", street=" + street + ", city=" + city + "]";
	}
}
