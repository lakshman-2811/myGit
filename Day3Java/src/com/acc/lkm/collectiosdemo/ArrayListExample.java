package com.acc.lkm.collectiosdemo;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<StudentMarks> sm = new ArrayList<>();
		sm.add(new StudentMarks(87));
		sm.add(new StudentMarks(98));
		sm.add(new StudentMarks(80));
		sm.add(new StudentMarks(68));
		sm.add(new StudentMarks(52));
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(StudentMarks i : sm) {
			System.out.print(i.result()+"\n");
		}
	}

}
