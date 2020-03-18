package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
		//char[] grades= {'A','B','C','E'};
		//getting all elements
	//	for (int i =0;i<grades.length;i++) {
		//	System.out.println(grades[i]);
	//		
		//}
	//}
		
     //create an array of fruits and retrieve all elements
		 //Tasks in class	1
     String[] animals= {"zepra","cow","Sheep","goat","kongo","Snake"};
     
     for (int i=0;i<animals.length;i++) {
    	 System.out.println(animals[i]);
     }
     //2nd way
     for (String animal:animals) {
    	 System.out.println(animal);
     }
     System.out.println("---------------------");
     
     
     
     //task 2
     int [] numbers= {4,5,6,7,8,9,};
     int sum;
	for (int i:numbers) {
    	 sum+=i;
    	 
     }
     System.out.println("Some of all elements in mumber array="+ sum);
     
     
   
     
     
     
     
     
     
     
     
     System.out.println("------------------");
     
    
     //TASK 3
     String [] countries= {"USA","Brazil","Mexio","Turkey","canada","Bosna"};
     for (int i=0;i<countries.length;i++) {
    	 System.out.println(countries[i]);
     }
     //2nd way
     for (String country:countries) {
    	 System.out.println(country +" ");
     }
	
	
}
		
}
