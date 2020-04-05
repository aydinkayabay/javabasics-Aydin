package com.syntax.class15;

public class Methods {

	
		// TODO Auto-generated method stub
 //create methods that will say welcome 10 times
		void sayWelcome(){	
		for (int i=0;i<=10;i++) {
			System.out.println("welocome");	
			}
			
		}
	//create methods that will say any words numbers of 2 times
		void sayAnything (String word,int times) {
			for (int i=1;i<=times;i++) {
				System.out.println(word);
			}
		}
//create methods boolean value isItraining
		//that will accept boolean valueas param
		//and based on the value it will print message accordingly 
	
		void isItRaining(boolean isRain) {
			if (isRain) {
				System.out.println("Its raining stay home and learn Java");
			}else {
				System.out.println("its not raining go for a walk");
				
			}
		}
	}
}}