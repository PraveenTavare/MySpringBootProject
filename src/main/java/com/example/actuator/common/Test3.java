package com.example.actuator.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		List<Employee> listEmp = new ArrayList<>();
		
		listEmp.add(new Employee(1,"Praveen", 20000.0));
		listEmp.add(new Employee(2,"Ajay", 2000.0));
		listEmp.add(new Employee(3,"Sanjay",10000.0));

		
		System.out.println(listEmp.stream().filter(emp -> emp.getSalary() > 5000).
		collect(Collectors.toList()));
		
		System.out.println(listEmp.stream().map(Employee::getName).collect(Collectors.toList()));
		
		String str = "jan,mar,jun,aug,sep,dec,nov,may,feb,apr,jul";
		 
	//	convert comma seperated String to arrayList
		List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
		Collections.sort(list);
		
		System.out.println(list);
		
		List<String> sortedList = Arrays.stream(str.split(",")).sorted().toList();
		
		System.out.println(sortedList);
		
		List<String> newList = Arrays.asList("java", "php", "sql");
		
		newList.sort(String::compareTo);
		
		System.out.println(newList);
		
		// in desc order
		
		newList.sort((a,b) -> b.compareTo(a));
		
		System.out.println(newList);



		
		
		 
	}
	
	
	

}
