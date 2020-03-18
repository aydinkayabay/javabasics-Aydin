package com.aydin.practices;

public class StringPractices {

	public static void main(String[] args) {
		String name="Aydin";
     String lastname=new String("Hello");
     System.out.println(name.length());
	 System.out.println(lastname.length());
      System.out.println(name+lastname);

	String mars=name+lastname;
	System.out.println(mars);
	
	int size = name.length();
	System.out.println(size);
	
	String gul="    evrisi Yollari dar    ";
	System.out.println(gul.toUpperCase());
	System.out.println(gul.toLowerCase());
	String carname= "Toyota rav4";
	String model="2019";
	 String color="white";
	
	System.out.println(carname+" "+model);
	String newcar =carname.concat(" "+model);
	System.out.println(newcar);
	String carlot=carname.concat(" "+model+" "+color);
	System.out.println(carlot);
	
 

     String eyecolor ="";
     boolean empty=eyecolor.isEmpty();
     System.out.println(empty);

  gul=gul.trim();
  System.out.println(gul);


	}
}


      












