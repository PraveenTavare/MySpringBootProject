package com.example.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	
	public static void main(String[] args) {
		
		
		// Blank stream
		Stream<Object> stream1 = Stream.empty();
		
		String[] names= {"Ravi", "Sunil", "Raj", "Sham", "Pavan"};
		Stream<String> stream2 = Stream.of(names);
		Stream<String> stream3 = Stream.of(names);

		stream2.forEach(name -> {
			System.out.println(name);
		});
		
		// OR
		stream3.forEach(name -> System.out.println(name));
		
		// Creating stream using Builder
		Stream<Object> streamBuilder = Stream.builder().build();
		
		// using Arrays.stream()
		Arrays.stream(names);
		
		// IntStream
		IntStream intStream = Arrays.stream(new int[]	{10,50,78,50});
		intStream.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------------------------------------------------");
		
		List<Integer> numList = List.of(10, 60, 5, 2, 78, 50);
		// Using sorted method - In asc order
		numList.stream().sorted().forEach(System.out::println);
		
		System.out.println("------------------------------------------------");

		// Using sorted method - In Desc order
		numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("------------------------------------------------");

		// Find 2nd max
		System.out.println(numList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
		
		//Find Max number
		System.out.println("Max number : "  + numList.stream().max((x,y) -> x.compareTo(y)).get());
		
		// Find Min number
		System.out.println("Min number : "  + numList.stream().min((x, y) -> x.compareTo(y)).get());
		
	}
}
