package com.javaooppractice;

import java.util.Arrays;

public class JavaCollectionArrey {

	public static void main(String[] args) {
		
		String[]name1;
		//name=new String[4]; old method
		
		/*name[0]="Hussain";
		name[1]="Farhan";
		name[2]="Rajia";
		name[3]="Nadira";
		System.out.println(name[1]);
		int x=0;
		for(x=0;x<=4;x++ ) 
		System.out.println(name[x]);*/
		//Index always start from "0"
		//Simble of Arrays []
		//String/int fruit/number[]={"mango","banana","apple","orange"};(formula for Array)
		//System.out.println(fruit.length)(for counting the object values)
		//Arrays.toString(variable name)(print the whole value together)
		//System.out.println(Arrays.toString(fruit));
        //How to count the length in Java..string count length();[ length Method],and Array count length [length operator] 
		//and in List use size();[size method]
		String name [][]= {{"Rajia","Nadira","Tamim","Jahid"},
                {"Faria","Lira","Asif",},         
               {"Arif","William","Tamim","Farhan"},
               {"Icc","BMW","Honda","Mandy"}};

        System.out.println(name[0][0]);
        System.out.println(name.length);
        System.out.println(Arrays.toString(name));
        for(String[] v:name) {
	    System.out.println(Arrays.toString(v));}
	
		String fruit[]={"mango","banana","apple","orange"};
		System.out.println(fruit[1]);
	    System.out.println(fruit.length);
	    System.out.println(Arrays.toString(fruit));
	    
	    int number[]= {10,15,25,40,50};
	    System.out.println(number.length);
	    for(int i=0;i< number.length;i++) {
	    	System.out.println(number[i]);
	    }
	    	//Advanced or Enhanced loop
	      // for(data type:variable name) {}...Advanced loop formula
	       for(int i:number) {System.out.println(i);
	       }
}
}