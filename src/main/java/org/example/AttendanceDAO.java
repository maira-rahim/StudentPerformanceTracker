package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AttendanceDAO {

    public void saveAttendance(Attendance a) {

        try {
            Connection conn = DatabaseConnection.getConnection();

            String sql = "INSERT INTO attendance(student_id, total_classes, attended_classes) VALUES (?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, a.getStudentId());
            ps.setInt(2, a.getTotalClasses());
            ps.setInt(3, a.getAttendedClasses());

            ps.executeUpdate();

            System.out.println("Attendance Saved");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}