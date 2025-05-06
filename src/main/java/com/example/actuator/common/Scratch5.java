package com.example.actuator.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Scratch5 implements Comparator {
	
		static class Emp {

			private String name;

			private Integer empId;
	 
			public Emp(String name, Integer id) {

				this.name = name;

				empId = id;

			}

		}
	 
		// main method

		public static void main(String[] args) {

			Emp emp1 = new Emp("abhijeet", 1);

			Emp emp2 = new Emp("rohit", 2);

			Emp emp3 = new Emp("karma", 3);

			Emp emp4 = new Emp("andrii", 4);

			Emp[] arr1 = { emp1, emp2, emp3, emp4 };
	 
			Emp emp5 = new Emp("abhijeet", 1);

			Emp emp6 = new Emp("rahul", 4);

			Emp emp7 = new Emp("ravi", 7);

			Emp emp8 = new Emp("andrii", 4);

			Emp emp9 = new Emp("william", 9);

			Emp emp10 = new Emp("rohit", 2);

			Emp[] arr2 = { emp5, emp6, emp7, emp8, emp9, emp10 };
	 
			System.out.println(Arrays.toString(findCommonEmps(arr1, arr2)));
	 
		}
	 
		public static Emp[] findCommonEmps(Emp[] arr1, Emp[] arr2) {
			
			List<Emp[]> list1 = new ArrayList<Scratch5.Emp[]>();
			List<Emp[]> list2 = new ArrayList<Scratch5.Emp[]>();

			list1.add(arr1);
			
			list2.add(arr1);
			
			
			if(list1.contains(list2)) {
				System.out.println(list1);
			} else {
			}
			
			return null;

		}

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}


}
