package com.syntax12;

public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str= new String ("Hello");
		String [][] groceries = {
				{"cucumber","Tomota","carrot"},
				{"milk","chese","chese1"}
				
		};
		System.out.println(groceries.length);
		
		System.out.println(groceries[1][0]);
		//get all values from 2d array
		for (int r=0;r<groceries.length;r++) {
			for (int c=0;c<groceries[r].length;c++) {
				System.out.println(groceries[r][c]+" ");
			}
			System.out.println();
		} System.out.println(str.length());
		String day ="Saturday";
		String date ="14";
		String newDate= day.concat(date);
		System.out.println(newDate);
		String str1=null;
		String str11="Aydin";
		boolean empty=str11.isEmpty();
		System.out.println(empty);
		String str4="  Welcome to Syntax!";
		str4=str4.trim();
		System.out.println("String with no leading or trailing space:"+str4);
		Object actual = null;
		Object expected = null;
		if (actual.equals(expected)) {
	     System.out.println("Test case pass. Title are matched");
		}else {
			System.out.println("test case fails.Titles are Not matched");
		}
		
		String browser="CHROME";
		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
			String message="Welcome Admin";
			System.out.println(message.contains("Admin"));
		boolean flag=message.contains("welcome");
		
		}	
		
		
		
		
		
		
		
	}

}
