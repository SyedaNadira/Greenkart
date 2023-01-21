package com.String;

public class StringPractice {

	

	public static void main(String[] args) {
		
		String name=new String("Rajia");
		name.concat("Sultana");
		String fullname=name.concat("Sultana");
		System.out.println(name);
		
		StringBuilder name1=new StringBuilder("Rajia");
		name1.append("Sultana");
		System.out.println(name1);
		
		StringBuffer name2=new StringBuffer("Bangladesh");
		name2.append("Dhaka");
		System.out.println(name2);
		
		String country="United States of America";
		char x=country.charAt(2);
		System.out.println(x);
		
		String country1="United States of America";
		String y=country1.toUpperCase();
		System.out.println(y);
		
		String country2="United States of America";
		String a=country2.toLowerCase();
		System.out.println(a);
		
		String country3="Tamim";
		int b=country3.indexOf("m");
		System.out.println(b);
		
	    boolean c = country.contains("s");
		System.out.println(c);
		
		int d=country.length();
		System.out.println(d);
		
		
		
		
	}

	
	}


