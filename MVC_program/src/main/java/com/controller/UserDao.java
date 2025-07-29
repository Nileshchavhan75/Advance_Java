package com.controller;

import java.sql.*;
import java.util.*;

public class UserDao {
    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "your_password");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM vidyarthi");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User u = new User();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                list.add(u);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
