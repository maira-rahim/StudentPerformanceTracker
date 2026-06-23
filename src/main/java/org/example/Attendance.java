package org.example;

public class Attendance {

    private int studentId;
    private int totalClasses;
    private int attendedClasses;

    public Attendance() {}

    public Attendance(int studentId, int totalClasses, int attendedClasses) {
        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() { return studentId; }
    public int getTotalClasses() { return totalClasses; }
    public int getAttendedClasses() { return attendedClasses; }

    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setTotalClasses(int totalClasses) { this.totalClasses = totalClasses; }
    public void setAttendedClasses(int attendedClasses) { this.attendedClasses = attendedClasses; }
}