package com.loop;

import java.util.Arrays;

public class PracticeArray {
public static void main(String[] args) {
		
		/*String fruit [] = {"Apple","Orange","Mango","Banana","Apricot"};
		System.out.println(fruit[2]);
		System.out.println(fruit.length);
		//System.out.println(string.length());
		System.out.println(Arrays.toString(fruit));
		for(int i = 0;i<fruit.length;i++) {
			System.out.println(fruit[i]);	
		}
		//Advanced formula for loop
		for(String b:fruit) {
			System.out.println(b);
		}
		 
		int number[]= {10,15,35,85,70,95};
		System.out.println(number[3]);
		System.out.println(number.length);
		System.out.println(Arrays.toString(number));
		
		for(int x=0;x<number.length;x++) {
			System.out.println(number[x]);
		}
        for(int v :number) {
        	System.out.println(v);
        }*/
        
        String name [][]= {{"Rajia","Nadira","Tamim","Jahid"},
	                       {"Faria","Lira","Asif",},
	                      {"Arif","William","Tamim","Farhan"},
	                      {"Icc","BMW","Honda","Mandy"}};
        
        System.out.println(name[0][0]);
        System.out.println(name.length);
        System.out.println(Arrays.toString(name));
        for(String[] v:name) {
        	System.out.println(Arrays.toString(v));
        	
        }
	}
  
  
	

}



  


  

