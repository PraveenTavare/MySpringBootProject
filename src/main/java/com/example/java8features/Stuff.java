package com.example.java8features;

import java.time.LocalDate;

public class Stuff {
	
	public static void doStuff() {
		System.out.println("This is my Task");
		System.out.println("Current date " +LocalDate.now());
	}

	public static void threadTask() {
		for (int i = 0; i <=10 ; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void printNumbers() {
		for (int i = 1; i <=100 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
