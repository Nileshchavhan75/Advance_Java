package com.controller;

import java.sql.*;

public class CallProcedureExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection con = DriverManager.getConnection(url, username, password);
                CallableStatement cst = con.prepareCall("{ call getStudentName(?) }");
            ) {
                cst.setInt(1, 103);  // Roll number
                ResultSet rs = cst.executeQuery();

                while (rs.next()) {
                    String name = rs.getString("name");
                    System.out.println("Student Name: " + name);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
