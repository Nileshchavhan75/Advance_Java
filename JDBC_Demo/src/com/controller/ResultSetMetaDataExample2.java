package com.controller;
import java.sql.*;
public class ResultSetMetaDataExample2 {
	public static void main(String [] args) {
		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "Nilesh@7";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection con = DriverManager.getConnection(url,username,password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM students");
				){
				
				ResultSetMetaData metadata = rs.getMetaData();
				
				int columnCount = metadata.getColumnCount();
				System.out.println("Total column: "+columnCount);
				for(int i = 1; i<=columnCount; i++) {
					System.out.println("Column"+i+": "+metadata.getColumnName(i)+
							",Type: "+metadata.getColumnTypeName(i));
				}
			}
		}catch(Exception e) {
			System.out.print("Error: "+e.getMessage());
		}
	}
}
