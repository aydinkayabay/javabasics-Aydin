package com.syntax.class13;

public class class13 {

	public static void main(String[] args) {
		/*Write to program to swap 2 numbers 
		 * without a temporary variable swap 2 String without a tempaory 
		 * 
		 */
		
		int a =10;
		int b=20;
		a =a=b;//30
		
		b=a-b;//30-20=10
		
		System.out.println("The value of a ="+a);
		System.out.println("The value of b="+b);
		String str1= "Day";
		String str2 ="night";
		str1=str1+str2;//DayNight
		str2= str1.substring(0,3);//Day
		str1=str1.substring(4);//Night
		System.out.println("The value of str1="+str1);
		System.out.println("The value of str2="+str2);
		
		
		
		
		
		
	

	}

}
