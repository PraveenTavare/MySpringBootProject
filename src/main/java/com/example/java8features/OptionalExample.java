package com.example.java8features;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated me thod stub
		System.out.println("Java Optional Examples ");
		
		String str = null;
		
		Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.isPresent()); // False as value is null 
	//	System.out.println(optional.get()); // throws NoSuchElementException as value is Null
		
		System.out.println(optional.orElse("value is null"));
		
	//	System.out.println(optional.orElseThrow());
		
		System.out.println("---------------------------------------------");
		
		String str2 = "Java is a Good";
		System.out.println(Optional.ofNullable(str2));
		
		System.out.println(Optional.ofNullable(str2).get());
		System.out.println(Optional.ofNullable(str2).isPresent());
		
		System.out.println(Optional.ofNullable(str2).orElse("value not Present"));
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(getName().orElse("Name is null"));
		
	}
	
	public static Optional<String> getName() {
		return Optional.ofNullable(null);
	//	return Optional.ofNullable("Praveen");
//		return Optional.of("Praveen");
	}

}
