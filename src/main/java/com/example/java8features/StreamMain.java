package com.example.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(1, 5, 8, 9, 25, 80, 700);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(25);
		list2.add(20);
		list2.add(14);
		list2.add(78);
		list2.add(5);

		List<Integer> list3 = Arrays.asList(25, 80, 45, 77, 100, 59);

		List<Integer> evenNumList = new ArrayList<Integer>();

		// without stream, using for each
		for (Integer i : list1) {
			if (i % 2 == 0) {
				evenNumList.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(evenNumList);

		// using stream
		
		Stream<Integer> stream = list1.stream();
		List<Integer> newEvenList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(newEvenList);
		
		 // or all in same line stream chaining
		System.out.println(list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		
		// Print numbers > 10
		System.out.println(list1.stream().filter(i-> i > 10).collect(Collectors.toList()));

		
		
	}

}
