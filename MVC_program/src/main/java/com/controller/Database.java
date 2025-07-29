package com.controller;

import java.sql.*;
public class Database {
  public static void insert(InsertBean bean) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Nilesh@7");

      PreparedStatement ps = con.prepareStatement("INSERT INTO vidyarthi (username, password) VALUES (?, ?)");
      ps.setString(1, bean.getUsername());
      ps.setString(2, bean.getPassword());
      ps.executeUpdate();

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
