package com.acc.lkm.collectiosdemo;
import java.util.*;
public class Test  {

	public static void main(String[] args) {
		ArrayList<Customer>al = new ArrayList<>();
		al.add(new Customer("lucky" , "Bike" , 20000));
		al.add(new Customer("John" , "Car" , 20000));
		al.add(new Customer("Bunty" , "Cyclone" , 20000));
		
		for (Customer c : al) {
			System.out.println(c.result());
		}

	}

}
