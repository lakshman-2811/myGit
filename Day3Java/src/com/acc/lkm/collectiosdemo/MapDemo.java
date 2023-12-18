package com.acc.lkm.collectiosdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String args[]) {
		Map<Integer,String>map = new HashMap<Integer,String>();
		map.put(12, "java");
		map.put(13, "SAP");
		map.put(14, "SFDC");
		map.put(14, "Azure");
		map.put(null, "Hybris");
		map.put(15, null);
		map.put(16, null);
		System.out.println(map);
		map.remove(14);
		System.out.println(map);
	}
}
