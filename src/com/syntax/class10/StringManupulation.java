package com.syntax.class10;

import java.util.Scanner;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String fullAd="Yummm..\nMY..ohh oh my \tchicken pie.";
      String password="Let me in";
      
      System.out.println("Guess the password:");
      //input
      Scanner scan=new Scanner(System.in);
      String guess=scan.nextLine();
      System.out.println(password.contentEquals(guess));
      
      System.out.println(fullAd.repeat(9));
		
	}
}
		
		
		
		
		
	


