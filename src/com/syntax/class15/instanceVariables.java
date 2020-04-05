package com.syntax.class15;

public class instanceVariables {
	String name;//instance variable
	

	public static void main(String[] args) {
		String name ="Yunus";
		System.out.println(name);
		instanceVariables obj =new instanceVariable();
         System.out.println(obj.name);
         obj.name="Ali";
         System.out.println(obj.name );
         System.out.println(name);
         
	}

}
