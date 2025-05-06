package com.example.actuator.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Emp {
	
	private final String name;
    private final List<Address> addresses;
	
	public Emp(String name, List<Address> addresses) {
		this.name = name;
		this.addresses = Collections.unmodifiableList(List.copyOf(addresses));
	}

	public String getName() {
		return name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", addresses=" + addresses + "]";
	}

	public static void main(String[] args) {
		List<Address> addressList = new ArrayList<>();
		Address address = new Address(null, "jaynager", "Bangalore");
		addressList.add(address);
		Emp emp = new Emp("Praveen", addressList);
		System.out.println(emp);
		Address address1 = new Address(null, "JP Nager", "Bangalore");
		addressList.add(address1);
		
		address.city = "pune";
		System.out.println(emp);

	}
}


