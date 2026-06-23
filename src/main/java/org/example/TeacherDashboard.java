package org.example;

import javax.swing.*;

public class TeacherDashboard extends JFrame {

    public TeacherDashboard() {

        setTitle("Teacher Dashboard");

        JLabel title = new JLabel("TEACHER PANEL");

        JButton addBtn = new JButton("Add Student");
        JButton viewBtn = new JButton("View Students");
        JButton attBtn = new JButton("Add Attendance");

        title.setBounds(90, 20, 200, 30);

        addBtn.setBounds(70, 70, 150, 35);
        viewBtn.setBounds(70, 120, 150, 35);
        attBtn.setBounds(70, 170, 150, 35);

        add(title);
        add(addBtn);
        add(viewBtn);
        add(attBtn);

        setSize(320, 280);
        setLayout(null);
        setVisible(true);

        addBtn.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Name");
            String course = JOptionPane.showInputDialog("Course");
            double marks = Double.parseDouble(
                    JOptionPane.showInputDialog("Marks")
            );

            new StudentDAO().addStudent(new Student(0, name, course, marks));

        });

        viewBtn.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();

            for (Student s : new StudentDAO().getAllStudents()) {

                double gpa = new GradeDAO().calculateGPA(s.getMarks());

                sb.append(s.getId())
                        .append(" | ")
                        .append(s.getName())
                        .append(" | ")
                        .append(s.getCourse())
                        .append(" | Marks: ")
                        .append(s.getMarks())
                        .append(" | GPA: ")
                        .append(gpa)
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, sb.toString());
        });

        attBtn.addActionListener(e -> {

            int id = Integer.parseInt(JOptionPane.showInputDialog("Student ID"));
            int total = Integer.parseInt(JOptionPane.showInputDialog("Total Classes"));
            int attended = Integer.parseInt(JOptionPane.showInputDialog("Attended"));

            new AttendanceDAO().saveAttendance(
                    new Attendance(id, total, attended)
            );

            JOptionPane.showMessageDialog(this, "Saved!");
        });
    }
}