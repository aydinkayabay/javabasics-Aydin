package com.syntax.class17;

public class staticKeywordTest {

	public static void main(String[] args) {
		staticKeyword.brand="Android";
		staticKeyword.touchscreen=true;
		staticKeyword.displaySpecifications();
		//acces instance members of another class
		staticKeyword sk=new staticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		
		
		
		
		
		
		
	
	}

}
