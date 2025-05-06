package com.example.java8features;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of i : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.setName("Demo1");
		thread.setPriority(1);
		thread.start();
		Thread.currentThread().setName("Demo");
		System.out.println(Thread.currentThread().getName());
		
		Runnable runnable2 = () -> {
			
			try {
				for(int i = 1; i <= 10; i++) {
					System.out.println("Multiple of 2 : " + i*2);
					Thread.sleep(2000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		};
		
		Thread th = new Thread(runnable2);
		th.setName("Demo2");
		th.start();
		System.out.println(Thread.currentThread());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
