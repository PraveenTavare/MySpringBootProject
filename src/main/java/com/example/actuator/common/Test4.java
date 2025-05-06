package com.example.actuator.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		
	//	int arr[] = {1,2,3,4,5};
		
//		System.out.println(rotateArray([1,2,3,4,5],1)); // [5,1,2,3,4]
	//	System.out.println(rotateArray([1,2,3,4,5],2)); // [4,5,1,2,3]
		
		List<Integer> list = new ArrayList<> (Arrays.asList(1,2,3,4,5));
		
		for(int i = 0 ; i < 3; i++) {
			rotateArray(list, 1);
			System.out.println(" Rotation : " + (i + 1)  + list);
		}
	}

	private static void rotateArray(List<Integer> list, int step) {
		// TODO Auto-generated method stub
        step = step % list.size();
        if (step == 0) return;

        Collections.rotate(list, step);
	}

}
