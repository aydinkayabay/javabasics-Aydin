package com.syntax.class11;

public class taskinclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] car= {
				{"Ford","chevy","lincoln"},
				{"BMW","mercedes","vw"},
				{"Kia","hundai"},
				{"fiat"}
		};
   for (String []cars:car) {
	   for (String carnames:cars) {
		   System.out.println(carnames+"");
	   }
   System.out.println();
	}
	
// create array countries
	String [][] countries= {
			{"canada","usa","mexio"},
			{"Brazil","peru"}
	};
		for (String[]country:countries)	{
			for (String countrynames:country) {
				System.out.println(countrynames+"");
			
			}System.out.println(country.length);
		}}}
