package com.syntax.class13;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse String charecter
		//word by word
		String given ="I love Java";
		for (int i=given.length()-1;i>=0;i--) {
		Object reversed =reversed+given.charAt(i);
		}
		System.out.println("Reversed String="+reversed);
		
		String []array=given.split("");
		
		for (int i=array.length-1;i>0;i--) {
			String reversedWords;
			Object reversedWords1 = reversedWords1+array[i]+" ";
		}

	}

}
