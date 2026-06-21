package org.example;

public class Grade {

    private int studentId;
    private double marks;
    private String grade;

    public Grade() {
    }

    public Grade(int studentId, double marks, String grade) {
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}