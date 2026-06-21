package org.example;

public class Course {

    private int id;
    private String courseName;

    public Course() {
    }

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }
}