package com.example.java8features;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jFrame = new JFrame();
		
		JButton button = new JButton();
		// Using Anonymous class and provide implementation
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click on Button");
			}
		});
		jFrame.add(button);
		
		// Using Lambda and provide implementation
		button.addActionListener( (e) -> {
			System.out.println("Click on Button using Lambda");
		});
	}
}
