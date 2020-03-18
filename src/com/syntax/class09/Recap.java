package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=0;i<=3;i++) {
			System.out.println("Hello Gul");
		for (int j=1;j<=3;j++) {
			System.out.println("Bye");
			
		}
		}
		//using the nested loops pramid
		
		for (int i=1;i<=3;i++) {
			for (int k=1;k<=5;k++) {
				System.out.println(i+" "+k);
				
			//using nested loop to print 10 until 99
				for (int x=1;x<=9;x++) {
					for (int a =0;a<=9;a++) {
						System.out.println(x+" "+ a);
					}
				}
				// 
				for (int h=0;h<=23;h++) {
					for (int m=0;m<=59;m++) {
						if(m<10) {
							System.out.println(h+":0"+m);
						}else {
						System.out.println(h +":"+m);
					}
				}
				}
			}
		}
	}
}
				
				
				
			

	