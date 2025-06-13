package com.jdbc;

import java.sql.*;
public class JDBCconnection {
	public static void main(String[] args)  {
		
		try {
			// 1) load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2) Create Connection
			String url = "jdbc:mysql://localhost:3306";
			String uname = "root";
			String password = "adeshpol141546";
			
			Connection con = DriverManager.getConnection(url,uname,password);
			
			// 3) check if connected
			if (con.isClosed()) {
				System.out.println("Connection is CLOSED");
			}else {
				System.out.println("Connection established successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
