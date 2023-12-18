package com.acc.lkm.javaday3;

import java.io.IOException;
import java.sql.SQLException;

public class Empdetails {
	public static void validation(int proj_id) throws IOException , SQLException{
		if(proj_id == 100) {
			throw new IOException("project is pharma....");
		}
		else {
			throw new SQLException("Invali Exception");
		}
	}


	public static void main(String[] args) {
//		try {
//			validation(100);
//		}
//		catch (Empdetails e){
//			System.out.println("exception thrown");
//		}
		
	}
}
