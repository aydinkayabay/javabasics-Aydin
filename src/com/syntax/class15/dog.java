package com.syntax.class15;

public class dog {
	String name,size;
	int age=5;
      void displayDog() {
	 System.out.println("Dog name is "+name+"and it" +size+" dog and age is "+age );
 }
 
	public static void main(String[] args) {
		dog dog1=new dog();
		dog1.name="Lucy";
		dog1.size="big";
		dog1.age=5;
       displayDog();
	}
	
	
	

}
