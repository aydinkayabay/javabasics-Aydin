package com.syntax.class15;

public class Google {
	//define future such as emp id name and last name and salary and title
	// define a behavior working get paid meeting 
	 String name;
	 int employeId;
	 double salary ;
	 String lastname ,title;
	 
	
	void working() {
		System.out.println(title+"  is working");
	}
	void getPaid() {
		System.out.println(name+"  is gettting paid "+salary);
	}
	
	void attendingMeetings() {
		System.out.println(name +"  attending meetings");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Google emp1=new Google();
     emp1.employeId=123;
     emp1.name="john";
     emp1.title ="CEO";
     emp1.lastname="Smith";
     emp1.salary=20000;
      emp1.working();
      emp1.getPaid();
      emp1.attendingMeetings();
      
      Google emp2=new Google();
      emp2.employeId=124;
      emp2.name="Aydin";
      emp2.title ="Carraol";
      emp2.lastname="S";
      emp2.salary=20000;
       emp2.working();
       emp2.getPaid();
       emp2.attendingMeetings();
       
      
      
      
      
		
		
		
	}

}
