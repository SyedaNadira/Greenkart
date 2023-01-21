package com.javaooppractice;

public class ExecuteClassForEncapsulation {

	public static void main(String[] args) {
		EncapsulationPractice obj=new EncapsulationPractice();
		String name=obj.getName();
		int age=obj.getAge();
		System.out.println("Name is:"+ name + " age is:"+age);

	}

}
