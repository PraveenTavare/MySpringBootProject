package com.example.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Threads","Bin","Brush","Tap","Fan","Bulb");
		 
		//T -> Thread, Tap
		//B -> Bin, Brush, Bulb
		//F-> Fan\
		Map<Character, List<String>> map = new HashMap<>();
		
		map = list.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
		
		System.out.println(map);
		
		
		 
	}

}
