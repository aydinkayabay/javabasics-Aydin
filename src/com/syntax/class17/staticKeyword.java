package com.syntax.class17;

public class staticKeyword {
	//createatemplate for a phone
	static String color;
	static int memory;
	static String brand;
	static boolean touchscreen;
	//return  type name ,parameters
	void displayGeneralInfo() {
		String touchScreen = null;
		System.out.println("we are building "+brand+"with touch screen ="+touchScreen);
	}
	
	static void displaySpecifications() {
		System.out.println("we build phone with "+memory +"gb memory in "+color+"color");
	
	}
	public static void main(String[] args) {
		brand="iphone";
		boolean touchScreen = true;
		staticKeyword obj =new staticKeyword();
		obj.color="grey";
		obj.memory=64;
		obj.displaySpecifications();
		obj.displayGeneralInfo();
	}

}
