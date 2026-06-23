package org.example;

import javax.swing.*;

public class StudentDashboard extends JFrame {

    public StudentDashboard() {

        setTitle("Student Dashboard");

        JTextArea area = new JTextArea();
        JButton btn = new JButton("View Data");

        area.setBounds(20, 20, 250, 120);
        btn.setBounds(80, 160, 120, 30);

        add(area);
        add(btn);

        setSize(320, 250);
        setLayout(null);
        setVisible(true);

        btn.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();

            for (Student s : new StudentDAO().getAllStudents()) {

                double gpa = new GradeDAO().calculateGPA(s.getMarks());

                sb.append("Name: ").append(s.getName())
                        .append(" | Course: ").append(s.getCourse())
                        .append(" | Marks: ").append(s.getMarks())
                        .append(" | GPA: ").append(gpa)
                        .append("\n");
            }

            area.setText(sb.toString());
        });
    }
}