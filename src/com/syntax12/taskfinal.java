package com.syntax12;

public class taskfinal {

	public static void main(String[] args) {
		String str="color of the world";
		str=str.replace(" ","");
		System.out.println(str);
		
		String str1= "Hello World !234";
		System.out.println(str.length);
		
		
		//task 3
		String a ="Is it Saturday? ,is it raining?, Do we have java Class today,How many sentencees are in the that String";
		String [] sentence=a.split(",l");
		System.out.println(sentence[3].length);
		
		

	}

}
