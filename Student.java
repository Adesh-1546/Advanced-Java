package com.jdbc;

import java.sql.*;


public class Student {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","adeshpol141546");
		
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from stud_details");
		System.out.println("Query executed succesfully");
		
		 
		
		con.close();
	}

}
