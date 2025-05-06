package com.example.java8features;

public class ConstructorMain {
	
	public static void main(String[] args) {
		System.out.println("Running ConstructorMain class");
		
		// Normal way
		Provider provider = () -> {
			return new Student();
		};
		Student student =  provider.getStudent();
		student.display();
		
		// Using Constructer Reference
		//ConstructerName::new
		Provider provider2 = Student::new;
		provider2.getStudent();
	}

}
