package com.string;

import java.util.Arrays;

public class StringPractice {

	

	public static void main(String[] args) {
		/*String country="Bangladesh";
		int x=country.length();// formula for length method.
		System.out.println(x);
		
		StringBuffer sb= new StringBuffer("Java");
		sb.append("Rules");
		System.out.println(sb);//formula for append method.
		
		String name="Rajia";
		name.concat("Sultana");//formula for concat method.
		System.out.println(name);
			*/	
		String Country= "United State of America";
		char x=Country.charAt(20);//formula for charAt method.
		System.out.println(x);
		
		int y=Country.indexOf("A");//formula for indexOf method.
		System.out.println(y);
		
		Country.toUpperCase();//formula for toUpperCase method.
		System.out.println(Country.toUpperCase());
		
		Country.toLowerCase();
		System.out.println(Country.toLowerCase());
		
		 boolean xy=Country.contains("U");//formula for contains method.
		 System.out.println(xy);
		 
		 String name="Apple";
		 String name1="Apple";
		 System.out.println(name==name1);
		 
		 String str=new String("Apple");
		 System.out.println(name==str);//false
		 System.out.println(name.equals(str));// true  formula for equals method.
		 
		 String Country1="United State Of America";
		 String []split=Country1.split(" ");
		 System.out.println(Arrays.toString(split));//formula for split method(important for interview)
		 
		 String number="100";
			int z =Integer.parseInt(number);//formula for converting string to int/integer
			System.out.println(z+50);
			
			String number2="100";
			double f=Double.parseDouble(number);
			System.out.println(f+.30);
		
		
		

	}

	private static String[] Country1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
