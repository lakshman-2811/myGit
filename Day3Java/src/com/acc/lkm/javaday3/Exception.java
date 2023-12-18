package com.acc.lkm.javaday3;
import java.lang.*;
public class Exception {

	public static void main(String[] args) {
		int a=10,b=0;
		int arr[] = {1,2,3,4,5};
		String b1 = null;
		String str = "Lucky";
		try {
//			int c = a/b;
			int x = arr[8];
			b1.charAt(3);
			Integer num = Integer.valueOf(str);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException ex) {
			System.out.println(ex);
		}
		catch (ArrayIndexOutOfBoundsException ec) {
			System.out.println(ec);
		}
		catch (NumberFormatException exe) {
			System.out.println(exe);
		}
		finally {
			System.out.println("Finally Block Ecxeptions found");
		}
		
	}

}
