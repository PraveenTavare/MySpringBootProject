package com.example.actuator.common;

@FunctionalInterface
public interface MyInterface {

	void myMethod();
	
	default void myMethod2() {
		System.out.println("myMethod2() Running");
	}
	
	static void myMethod3() {
		System.out.println("myMethod3() Running");
	}
}
