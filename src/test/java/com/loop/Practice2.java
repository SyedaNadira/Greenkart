package com.loop;

import java.util.Arrays;

public class Practice2 {

	public static void findmaxvalue() {

		int number[] = { 10, 95, 80, 50, 100, 175 };
		int maxvalue = number[0];
		int min=number[0];
		for (int i = 0; i < number.length; i++) {             
			if (maxvalue <number[i]) {                       
				maxvalue = number[i];

			}
		}
		System.out.println(maxvalue);


	}
public static void findsecondvalue() {
	int number[] = { 200, 15, 80, 50, 100, 75 };
	Arrays.sort(number);
	int secendnumber=number[number.length-1];
	System.out.println(secendnumber);
}
public static void main(String[] args) {
	findsecondvalue();
}
}
