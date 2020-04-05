package com.syntax.class17;

public class AccesM {
	
	 
	private static String reverse (String  s) {
	 String reverse = "";
      String str="Hello";
      for (int i=str.length()-1;i>=0;i--) {
    	   reverse = reverse+str.charAt(i);
      }
      return reverse;
	}
      public  static void main (String []args) {
    	  AccesM s1=new AccesM();
    	  System.out.println(s1.reverse("Hello"));
      }
    	  
      }
	


