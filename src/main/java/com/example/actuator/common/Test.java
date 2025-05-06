package com.example.actuator.common;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// Test Case 1
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);
		System.out.println("Output: " + Arrays.toString(result)); // Output: [24, 12, 8, 6]
	}
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		// Arrays to store prefix and suffix products
		int[] prefix = new int[n];
		int[] suffix = new int[n];
		int[] result = new int[n];

		// Step 1: Calculate prefix products
		prefix[0] = 1; // No elements to the left of the first element
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}
		// Step 2: Calculate suffix products
		suffix[n - 1] = 1; // No elements to the right of the last element
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}
		// Step 3: Multiply prefix and suffix products
		for (int i = 0; i < n; i++) {
			result[i] = prefix[i] * suffix[i];
		}
		return result;
	}
}