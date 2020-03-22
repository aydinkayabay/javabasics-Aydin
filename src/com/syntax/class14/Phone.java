  package com.syntax.class14;

  public class Phone {
	String name;
	String model;
	int price;
	String color ;
	
  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone  phone1=new Phone();
		phone1.model="20219";
		phone1.color="blue";
		phone1.price=112;
		phone1 .name="Apple";
		
		phone1.talk();
		phone1.text();
		phone1.browser();
		
	}
	void talk() {
		System.out.println(name+"can talk");
	}
	void text() {
		System.out.println(name+" "+"can text");
		
	}
	void browser() {
		System.out.println(name +"browser web");
	}
	
	
		
		
		
		
}
	
