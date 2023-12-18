package com.acc.lkm.collectiosdemo;

public class Customer {
	private String name , product;
	private int price;
	public Customer (String name , String product,int price) {
		this.name = name ;
		this.product = product;
		this.price = price;
	}
	
	public String result() {
		return name+" "+product+" "+price;
	}

}
