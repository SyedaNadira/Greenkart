package com.javaooppractice;

public class BestBuyOutlet extends BestBuy{

	@Override
	public void employees() {
		int employees=10;
		System.out.println("BestBuy need employees"+10);
		
	}

	@Override
	public void location() {
	String jacksonhightstore="72-10,jacksonhight";
		System.out.println(" store Location Jacksonhight");
	}

	@Override
	public void onlinestore() {
		int onlinestore=5;
		System.out.println("online store"+5);
		
		
	}

}
