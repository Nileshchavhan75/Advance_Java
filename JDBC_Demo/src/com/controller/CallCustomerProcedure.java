package com.controller;

import java.sql.*;

public class CallCustomerProcedure {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement cs = conn.prepareCall("{ call getAllCustomers() }");
            ) {
                ResultSet rs = cs.executeQuery();

                System.out.println("Customer Records:");
                while (rs.next()) {
                    int id = rs.getInt("customer_id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");

                    System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
