package com.controller;

import java.sql.*;
public class UpdateExample {
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
                String updateQuery = "UPDATE student SET name = 'Nilesh' WHERE roll_num = 1";
                int rowsUpdated = statement.executeUpdate(updateQuery);

                if (rowsUpdated > 0) {
                    System.out.println("Data updated successfully!");
                } else {
                    System.out.println("Update failed.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
