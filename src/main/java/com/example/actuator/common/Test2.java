package com.example.actuator.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	public class Test2 {
	    public static void main(String[] args) {
	        String s = "ilovejavatech";
	        List<String> strList = Arrays.asList("java", "ooo", "pan", "veil", "vvaa");
	        // Get the frequency map of characters in the string `s`
	        Map<Character, Integer> frequencyMap = getFrequencyMap(s);
	        // Check each string in the list
	        List<Boolean> result = strList.stream()
	                .map(str -> canBeFormed(str, frequencyMap))
	                .toList();
	        // Print the result
	        System.out.println(result); // Output: [true, false, false, true, true]
	    }
	    // Helper method to check if a string can be formed from the frequency map
	    private static boolean canBeFormed(String str, Map<Character, Integer> frequencyMap) {
	        // Create a frequency map for the current string
	        Map<Character, Integer> strFrequencyMap = getFrequencyMap(str);
	        // Check if all characters in `str` can be formed using `frequencyMap`
	        for (Map.Entry<Character, Integer> entry : strFrequencyMap.entrySet()) {
	            char c = entry.getKey();
	            int count = entry.getValue();
	            // If `frequencyMap` does not contain the character or has fewer occurrences, return false
	            if (frequencyMap.getOrDefault(c, 0) < count) {
	                return false;
	            }
	        }
	        return true; // All characters can be formed
	    }
	    // Helper method to create a frequency map of characters in a string
	    private static Map<Character, Integer> getFrequencyMap(String str) {
	        Map<Character, Integer> frequencyMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }
	        return frequencyMap;
	    }
	}
