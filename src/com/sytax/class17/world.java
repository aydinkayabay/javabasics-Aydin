package com.sytax.class17;

public class world {

	public static void main(String[] args) {
		Baby baby1=new Baby();
		baby1.cry();
		//assign vaues
		baby1.firstName="Aydin";
		
		baby1.Lastname="Kayabay";
		baby1.gender='M';
		baby1.weight=7;
		baby1.hairColor="Yelow";
		
		//reasign values
		baby1.weight=8;
		System.out.println("baby1 firstName is "+baby1.firstName);
		
		
		

	}

}
