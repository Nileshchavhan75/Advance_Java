package com.controller;

import java.sql.*;
public class DeleteExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE roll_num = ?");
            ) {
                ps.setInt(1, 104);  // Change roll number as needed

                int rowsDeleted = ps.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("Student deleted successfully!");
                } else {
                    System.out.println("No student found with that roll number.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
