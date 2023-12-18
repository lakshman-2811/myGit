package com.acc.lkm.collectiosdemo;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>arrayList = new ArrayList<String>();
		arrayList.add("java");
		arrayList.add("Python");
		arrayList.add("SFDC");
		arrayList.add("SAP");
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\n");
		}
	}

}
