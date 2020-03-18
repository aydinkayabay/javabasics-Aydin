package com.syntax.class10;

import java.util.Scanner;

public class reviewThursday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("How many animals do you have ?");
		int length =input.nextInt();
		String []animals=new String [length];
		for (int count =0;count <length;count++) {
			System.out.println("Give me an animal.");
			String animal =input.next();
			animals [count]=animal;
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
