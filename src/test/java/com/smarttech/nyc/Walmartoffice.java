package com.smarttech.nyc;

import javax.swing.Spring;

public class Walmartoffice extends walmart{

	@Override
	public void employees() {
		int employees=10;
		System.out.println("Amazon need employee:"+10);
	}

	@Override
	public void location() {
	String jacksonhightstore="72-10,street";
	System.out.println(jacksonhightstore);	
	}

	@Override
	public void onlinestore() {
	int onlinestore=5;
	System.out.println("onlinestore:"+5);
	}
	
}
