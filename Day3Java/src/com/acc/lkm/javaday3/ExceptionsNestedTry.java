package com.acc.lkm.javaday3;
import java.lang.*;
public class ExceptionsNestedTry {

	public static void main(String[] args) {
		int a=10,b=20,c=0;
		try {
			if(a>b) {
				try {
					int d = b/c;
				}
				catch (ArithmeticException e) {
					System.out.println("inside nested try catch block...");
				}
				finally {
					System.out.println("inside nested try finally block...");
				}
			}
			else {
				int arr[] = {1,2,3,4,5};
				int x = arr[10];
			}
		}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("outside nested try catch block...");
			}
			finally {
				System.out.println("outside nested try finally block...");
			}

	}

}
