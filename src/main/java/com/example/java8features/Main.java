package com.example.java8features;

public class Main {

	public static void main(String[] args) {
		System.out.println("My system starts..");

		// Functional interfaces in java inbuild methods // Runnable,
		// Callable<V>,Comparable<T>

		MyInterfaceImplements myInterfaceImplements = new MyInterfaceImplements();
		myInterfaceImplements.sayHello();

		MyInterface myInterface = new MyInterfaceImplements();
		myInterface.sayHello();

		// using Anonymous class for implementing interface
		MyInterface myInterface2 = new MyInterface() {
			@Override
			public void sayHello() {
				System.out.println("Using 1st Anonymous class for implementing MyInterface");
			}
		};
		myInterface2.sayHello();

		MyInterface myInterface3 = new MyInterface() {
			@Override
			public void sayHello() {
				System.out.println("Using 2nd Anonymous class for implementing MyInterface");
			}
		};
		myInterface3.sayHello();

		// Using Lambda Expression using paranthesis
		MyInterface myInterface4 = () -> {
			System.out.println("Using Lambda expression using paranthesis");
		};
		myInterface4.sayHello();

		// Using Lambda expression without paranthesis, as its opttional, if we have
		// only statement
		MyInterface myInterface5 = () -> System.out
				.println("Using Lambda expression without paranthesis, as its optional, if we have only statement");
		myInterface5.sayHello();

		// Implementing SumInterface using Lambda
		SumInterface sumInterface = (int a,int b) -> {
			return a+b;
		};
		System.out.println(sumInterface.sum(10,20));
		
		// Implementing SumInterface using Lambda, here return not needed, paranthesis optional, and type to methods
		SumInterface sumInterface2 = (a,b) -> a + b; // done is shorter way
		System.out.println(sumInterface2.sum(20, 20));	
		
		
		LengthInterface lengthInterface = (str) -> {
			return str.length();
		};
		System.out.println(lengthInterface.getLength("Hello"));
		
		// shorter way
		LengthInterface lengthInterface2 = (str) -> str.length();
	//	or 
		LengthInterface lengthInterface3 = str -> str.length();

		System.out.println(lengthInterface2.getLength(""));
		
	}
}
