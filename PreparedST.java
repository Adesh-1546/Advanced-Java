package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PreparedST {
	public static void main(String[] args)  throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","adeshpol141546");
		
		PreparedStatement ps = con.prepareStatement("insert into stud_data(id,name,address) values(?,?,?)");
		ps.setInt(1,123);
		ps.setString(2,"Aadesh");
		ps.setString(3,"Pune");
		ps.executeUpdate();
		System.out.println("Data inserted");
		
		con.close();
	}

}
