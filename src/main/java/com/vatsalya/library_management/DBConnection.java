package com.vatsalya.library_management;

import java.sql.*;

public class DBConnection {

	private static Connection con = null;
	
	private DBConnection () {}
	
	static{
		
			try {
				Class.forName(DBInfo.DRIVER);
			
				con = DriverManager.getConnection(DBInfo.DB_URL, DBInfo.DB_USER_NAME,DBInfo.DB_USER_PASSWORD);
			
			
			
			} catch (Exception e) {
			
				System.out.println(e.getMessage());
			}
		}

	public static Connection getCon() {
		
		return con;
	}
}
