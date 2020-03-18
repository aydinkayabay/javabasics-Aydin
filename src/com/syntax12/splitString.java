package com.syntax12;

public class splitString {

	public static void main(String[] args) {
		// Split method
		String today2="Today is my favarite Java class";
		String[] words=today2.split("");
		
		for (int i =0;i<words.length;i++) {
			
			System.out.println(words[i]);
		}
		
		String today3="Today is my favorite java class";
		today3=today3.trim();
		System.out.println("String after triming :"+today3);
		
		
		
		
		
		
		
		
		

	}

}
