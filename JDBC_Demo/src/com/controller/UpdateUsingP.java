package com.controller;

import java.sql.*;

public class UpdateUsingP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE student SET name = ? WHERE roll_num = ?"
                );
            ) {
                ps.setString(1, "Shivay"); // new name
                ps.setInt(2, 103);        // roll number to update

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Data updated successfully");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
