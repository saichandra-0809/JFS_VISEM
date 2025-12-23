package com.skillnext1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    
    private static final String URL = "jdbc:mysql://localhost:3307/PAT";
    private static final String USER = "root";
    private static final String PASSWORD = "Kanna@0809"; // change this

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
      public boolean exists(int id) throws Exception {
        Connection conn = getConnection();
        String sql = "SELECT id FROM student WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        boolean present = rs.next();
        conn.close();
        return  present;   
    }

    public void addStudent(student stu) throws Exception{
        Connection conn=getConnection();
        String sql="Insert into student(name,email,dept) values(?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, stu.getName());
        stmt.setString(2, stu.getEmail());
        stmt.setString(3, stu.getDept());
        stmt.executeUpdate();
        conn.close();
    }
        // Fetch all stuudents
    public List<student> getAllStudents() throws Exception {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        List<student> list = new ArrayList<>();
        while (rs.next()) {
            student e = new student();
            e.setId(rs.getInt("id"));
            e.setName(rs.getString("name"));
            e.setEmail(rs.getString("email"));
            e.setDept(rs.getString("dept"));
            list.add(e);
        }
        conn.close();
        return list;
    }
     // Delete 
    public void deleteStudent(int id) throws Exception {
        Connection conn = getConnection();
        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }
       // Update employee
    public void updateStudent(student stu) throws Exception {
        Connection conn = getConnection();
        String sql = "UPDATE student SET name=?, email=?, dept=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, stu.getName());
        stmt.setString(2, stu.getEmail());
        stmt.setString(3, stu.getDept());
        stmt.setInt(4, stu.getId());
        stmt.executeUpdate();
        conn.close();
    }
}
