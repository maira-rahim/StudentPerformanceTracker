package org.example;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    public void addStudent(Student s) {

        try {
            Connection conn = DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO students(name, course, marks) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setDouble(3, s.getMarks());

            ps.executeUpdate();

            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> list = new ArrayList<>();

        try {
            Connection conn = DatabaseConnection.getConnection();

            String sql = "SELECT * FROM students";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getDouble("marks")
                ));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}