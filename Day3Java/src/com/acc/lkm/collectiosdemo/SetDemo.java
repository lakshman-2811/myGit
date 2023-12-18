package com.acc.lkm.collectiosdemo;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hashset = new LinkedHashSet<>();
		hashset.add("Spring");
		hashset.add("Hybernate");
		hashset.add("SpringBoot");
		hashset.add("MicroServices");
		hashset.add("Rest API");
		hashset.add(null);
		hashset.add("spring");
		System.out.println(hashset);
		LinkedHashSet<String> hashset1 = new LinkedHashSet<>();
		hashset1.add("BDC");
		hashset1.add("KDC");
		hashset.addAll(hashset1);
		System.out.println(hashset);
		hashset.remove(null);
		System.out.println(hashset);
	}

}
