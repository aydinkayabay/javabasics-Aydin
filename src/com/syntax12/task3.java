package com.syntax12;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String me="I m a good tester";
		System.out.println("Excellent ");
		String newString=me.replace("a","c" );
		System.out.println(newString);
		me=me.replace("Good", "Great");
	    System.out.println(me);
	    me=me.replace("great", "Awesome");
	    System.out.println(me);
	    String car="I have a Toyota";
	    car=car.replace("Toyota", "Lexus");
	System.out.println(car);
	
	String str="Phone numberis 12345679";
	System.out.println(str);
	str=str.replaceAll("[A-z-aaa]","23456");
	
	String subject="Java";
	subject=subject.replaceAll("a"+ "e");
	
	
	
	
	str=str.replace("[oldChar]"," newChar");
	
	
	}
}
