package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropCourseTable {
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
                String dropQuery = "DROP TABLE IF EXISTS course"; // Drop the 'course' table if it exists

                statement.executeUpdate(dropQuery);
                System.out.println("Table 'course' dropped successfully!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
