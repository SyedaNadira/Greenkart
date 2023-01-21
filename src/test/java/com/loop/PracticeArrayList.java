package com.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {

	public static void main(String[] args) {
		
		
		List<String>list=new ArrayList<String>();
		list.add("flower");
		list.add("house");
		list.add("river");
		list.add("road");
		list.add("horse");
		System.out.println(list);
		
	    for(String td:list) {
		System.out.println(td);
	}
		
		List<Integer>number=new ArrayList<Integer>();
		number.add(100);
		number.add(600);
		number.add(500);
		number.add(100);
		number.add(750);
		System.out.println(number);
		
		//for(int i=0;i<number.size();i++) {
			//System.out.println(number.get(i));
			
		for(Integer abc:number) {
	    System.out.println(abc);
			
		}
	}

}                                                                                                                                                                                      
