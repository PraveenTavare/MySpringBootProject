package com.example.actuator.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamExamples {

	public static void main(String[] args) {
		
		// Filter Even numbers from a List
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNumberList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		
		// Filter Odd numbers from a List
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> oddNumList = list2.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println(oddNumList);
		
		// Convert List<String> to Upper case
		List<String> stringList = Arrays.asList("java", "Spring", "Microservices");
		List<String> upperCaseStringList = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseStringList);
		
		//Sum of all numbers in a List
		List<Integer> list3 = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum = list3.stream().reduce(Integer::sum);
		System.out.println(sum);
		
		int newSum = list3.stream().reduce(0, Integer::sum);
		System.out.println(newSum);
		
		//Find max number in a list
		List<Integer> list4 = Arrays.asList(2,100,50,500,20); // 500 is the max
		Optional<Integer> maxNum = list4.stream().distinct().max(Integer::compareTo);
		System.out.println(maxNum);
		maxNum.ifPresent(System.out::println);
		
		//Find max number in a list -> different way
		List<Integer> list5 = Arrays.asList(2,100,50,500,20, 500); // 500 is the max
		int newSum2 = list5.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(null);
		System.out.println(newSum2);
		
		// Count elements Greater than a certain Value
		List<Integer> list6 = Arrays.asList(2,100,50,500,20,500); // Greater than 50
		System.out.println(list6.stream().filter(n -> n > 50).count()); // count number
		System.out.println(list6.stream().filter(n -> n > 50).collect(Collectors.toList())); // display those numbers

		// Sort List using stream
		List<Integer> list7 = List.of(200,20, 550, 700,10);
		System.out.println(list7.stream().sorted().collect(Collectors.toList())); // ASC sorting
		
		// DESC sorting
		System.out.println(list7.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())); // DESC sorting
		
		// Remove duplicates from a List
		List<Integer> list8 = Arrays.asList(1 , 2 , 2,100,50,500,20,500, 500, 100, 50); // Greater than 50
		System.out.println(list8.stream().collect(Collectors.toSet())); // 1. using Collectors.toSet()
		System.out.println(list8.stream().distinct().collect(Collectors.toList()));  // Using distinct() method
		
		// Group Elements by their Length
		List<String> fruitsList = Arrays.asList("apple", "banana", "mango", "cherry", "orange", "jackfruit");
		Map<Integer, List<String>> fruitMap = fruitsList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(fruitMap);
		
		// Join list of String to single String
		List<String> listNew = List.of("java", "Stream", "API");
		System.out.println(listNew.stream().collect(Collectors.joining(" ")));
		
		// Parallel Stream for faster Processing
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		intList.forEach(System.out::print);
		System.out.println();
		intList.stream().forEach(System.out::print);
		System.out.println();
		intList.parallelStream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------");
		
		List<Employee> empList = Arrays.asList(new Employee(1, "Alice", 30000.0), 
												new Employee(2, "Praveen", 50000.0),
												new Employee(2, "Bob", 60000.0), 
												new Employee(3, "Charlie", 70000.0), 
												new Employee(4, "David", 40000.0),
												new Employee(5, "Eve", 80000.0));
		
		// Example 1: Filter employees with salary < 50,000
		System.out.println(empList.stream().filter(emp -> emp.getSalary() < 50000).collect(Collectors.toList()));
		
		// Example 2: Get a list of employee names
		empList.stream().map(Employee::getName).forEach(System.out::println);
		System.out.println(empList.stream().map(Employee::getName).collect(Collectors.toList()));
		
		// Example 3: Calculate the total salary of all employees
		System.out.println(empList.stream().mapToDouble(Employee::getSalary).sum()); // 330000.0
		// max sal
		System.out.println(empList.stream().mapToDouble(Employee::getSalary).max());
		
		 Optional<Employee> highestEarner = empList.stream()
		            .max(Comparator.comparingDouble(Employee::getSalary));
		        highestEarner.ifPresent(emp -> System.out.println("Highest earner: " + emp));

		 // average sal
		OptionalDouble avgSal = empList.stream().mapToDouble(Employee::getSalary).average();
		System.out.println(avgSal.getAsDouble());
		
		// Example 5: Group employees by salary range
		Map<String, List<Employee>> salaryGroupsList = empList.stream().collect(Collectors.groupingBy(emp -> {
			if (emp.getSalary() <= 50000)
				return "Low";
			else if (emp.getSalary() <= 70000)
				return "Medium";
			return "High";
		}));
		System.out.println(salaryGroupsList);
 
	}

}
