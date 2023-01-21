package com.String;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringConvertion {

	public static void main(String[] args) {
		String number="150";
		int x=Integer.parseInt(number);//convert string to Integer
		System.out.println(x+50);
		
		String number1="150";
		double y=Double.parseDouble(number1);//convert string to double
		System.out.println(y+.25);
		
		double number2=150.50;
		String a=String.valueOf(number2);//convert double to string 
		System.out.println(a+.5);
		  
		int number3=100;
		String b=String.valueOf(number3);//convert Integer to string 
		System.out.println(b+25);
		

		StringJoiner obj=new StringJoiner("&");//Add two String  by useing add method(StringJoiner is a class) with(delimiter=,_ any sign)
		obj.add("Bangladesh").add("Dhaka").add("Banani");
		System.out.println(obj);
		
		String country="United States Of America";//Split word by useing split()method
		String[] sp = country.split(" ");
		System.out.println(Arrays.toString(sp));
		
		
		
		
	}

	
	}


