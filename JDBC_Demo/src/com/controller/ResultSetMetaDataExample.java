package com.controller;

import java.sql.*;

public class ResultSetMetaDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Nilesh@7";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (
                Connection con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM student");
            ) {
                // Get metadata object
                ResultSetMetaData metaData = res.getMetaData();

                int columnCount = metaData.getColumnCount();
                System.out.println("Total Columns: " + columnCount);

                // Print column names
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println("Column " + i + ": " + metaData.getColumnName(i)
                                       + " ,Type: " + metaData.getColumnTypeName(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
