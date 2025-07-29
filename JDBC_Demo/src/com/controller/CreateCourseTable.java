package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCourseTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
            ) {
                String createQuery = "CREATE TABLE IF NOT EXISTS course (" +
                                     "course_id INT PRIMARY KEY," +
                                     "course_name VARCHAR(100)," +
                                     "duration INT" +
                                     ")";
                
                statement.executeUpdate(createQuery);
                System.out.println("Table 'course' created successfully!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
