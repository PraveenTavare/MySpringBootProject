package com.example.java8features;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Starts ...");
		System.out.println("learning Method Referce ");
		
		// Provide the implementation for WorkInterface doTask() method using Lambda
		WorkInterface workInterface = () -> {
			System.out.println("doTask() method Implementation..");
		};
		workInterface.doTask();
		
		// Using method Reference, refering static method, using the method implementaion already written in Stuff class
		//Classname::methodName
		WorkInterface workInterface2 = Stuff::doStuff;
		workInterface2.doTask();
		
		// Again Using method Reference, refering the Method already Written
		Runnable runnable = Stuff::threadTask;
		Thread t1 = new  Thread(runnable);
		t1.start();
		
		//Referring non-static method, using object
		// Object::methodName
		Stuff stuffObject = new Stuff();
		Runnable runnable2 = stuffObject::printNumbers;
		Thread t2 = new  Thread(runnable2);
		t2.start();
		
	}	
}
