package com.string;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		
		//int x=20;
		//System.out.println(x/0);//ArithmeticException
		
		try {
			String st=null;
			System.out.println(st.length());//NullPointException
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}
}

