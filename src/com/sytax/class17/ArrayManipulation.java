package com.sytax.class17;

public class ArrayManipulation {

	public int largestNumber(int []array) {
		for (int i=0;i<array.length;i++) {
			if (array[i]>largestNumber(null)) {
				int largest = array[i];
				
				
			}
		}
		return largestNumber(null);
		
	}
         public static void main (String[]args) {
        	 int [] array = {5,2,9,6,1,8};
        	 ArrayManipulation manip=new ArrayManipulation ();
        	 String largest = null;
			System.out.println("largest is "+largest);
	
}
}
