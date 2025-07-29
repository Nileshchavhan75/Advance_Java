package com.mvc.dao;

import com.mvc.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mvc.db.DatabaseConnection;
public class Operations {
	
	public int insertRecord(Student s) {
		int status=0;
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement stmt=con.prepareStatement("insert into student(name,roll,course)values(?,?,?);");
			stmt.setString(1,s.getName());
			stmt.setInt(2, s.getRollNo());
			stmt.setString(3,s.getCourse());
			status=stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public int updateRecord(Student s) {
		int status=0;
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement stmt=con.prepareStatement("update student set course=? where name=?;");
			stmt.setString(1,s.getCourse());
			stmt.setString(2,s.getName());
			status=stmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public int deleteRecord(Student s) {
		int status=0;
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement stmt=con.prepareStatement("delete from student where name=?;");
			stmt.setString(1,s.getName());
			status=stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
