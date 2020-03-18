package com.syntax.class10;

public class RetrievingValuesFrom2DArray {

	public static void main(String[] args) {
		// Task for class multiple arrays in month

		String[][] month = { 
				            { "jaunary", "February", "December" }, 
				            { "March", "April", "May" },
				            { "June", "July", "August" }, 
				            { "September", "October", "November" } 
				            };
		int rows = (month.length);// how many arrays
		int firstArray = month[0].length;
		System.out.println(firstArray);
		
		for (int i = 0; i < month.length; i++) {
			
			for (int j = 0; j < month[i].length; j++) {

			
			System.out.println(month[i][j]);

		}

	}
}}