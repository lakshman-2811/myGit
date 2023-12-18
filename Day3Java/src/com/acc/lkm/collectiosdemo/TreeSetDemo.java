package com.acc.lkm.collectiosdemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(200);
		System.out.println(ts+"-->");
		NavigableSet<Integer> ns = ts.descendingSet();
		for(Integer i : ns) {
			System.out.println(i+"-");
		}
		
		TreeSet<String> str = new TreeSet<>();
		str.add("lucky");
		str.add("yeshwanth");
		str.add("anuroop");
		str.add("abrar");
		System.out.println(str);
		
		NavigableSet<String> ns1 = str.descendingSet();
		for(String i : ns1) {
			System.out.println(i);
		}
	}

}
