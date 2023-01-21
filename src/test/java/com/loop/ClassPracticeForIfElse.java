package com.loop;

import io.netty.buffer.search.AbstractMultiSearchProcessorFactory;

public class ClassPracticeForIfElse {
	
		
	public static void main(String[] args) {
	     grading(96);
	}
	
	
	static void grading(int i) {
	
	if(i<=64) {
		System.out.println("Student fail");
	}
  else if(i>=65&&i<=75) {
	System.out.println("student get D");
	
}
  else if(i>=76&&i<=85) {
	System.out.println("Student get C");
}
	
 else if(i>=86&&i<=95) {
	 System.out.println("Student get B");
	 
}
 else if(i>=96&&i<=100) {
	System.out.println("Student get A"); 
 }
	}
}