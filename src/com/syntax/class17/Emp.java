package com.syntax.class17;

public class Emp {
	//create variables to hold :name,last,title,ssn,
	public String name;
	protected String lastname;
	public static String title;
	private long ssn;
	double salary;
	public void method1() {
		System.out.println("i m public method");
	}
	protected void method2() {
		System.out.println("i m protected methid");
	}
	void method3() {
		System.out.println("i m a private method");
	}
	void medhod4() {
		System.out.println("i m a default");
	}
	public static void main(String[] args) {
		Emp emp1=new Emp();
		emp1.name="AYdin";
		emp1.salary=200.00;
		emp1.lastname="kayabay";
		emp1.ssn=0999909;
		
		
		
		
	}

}
