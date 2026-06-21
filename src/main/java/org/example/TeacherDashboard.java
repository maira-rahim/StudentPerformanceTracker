package org.example;

import javax.swing.*;

public class TeacherDashboard extends JFrame {

    public TeacherDashboard() {

        setTitle("Teacher Dashboard");

        JButton addBtn = new JButton("Add Student");
        JButton viewBtn = new JButton("View Students");

        addBtn.setBounds(50, 50, 150, 30);
        viewBtn.setBounds(50, 100, 150, 30);

        add(addBtn);
        add(viewBtn);

        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addBtn.addActionListener(e -> {

            try {

                String name = JOptionPane.showInputDialog("Enter Student Name:");

                String course = JOptionPane.showInputDialog("Enter Course:");

                double marks = Double.parseDouble(
                        JOptionPane.showInputDialog("Enter Marks:")
                );

                Student student =
                        new Student(0, name, course, marks);

                StudentDAO dao = new StudentDAO();

                dao.addStudent(student);

                JOptionPane.showMessageDialog(
                        this,
                        "Student Added Successfully!"
                );

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Input!"
                );
            }
        });

        viewBtn.addActionListener(e -> {

            StudentDAO dao = new StudentDAO();

            StringBuilder sb = new StringBuilder();

            for (Student s : dao.getAllStudents()) {

                sb.append("ID: ")
                        .append(s.getId())
                        .append(" | Name: ")
                        .append(s.getName())
                        .append(" | Course: ")
                        .append(s.getCourse())
                        .append(" | Marks: ")
                        .append(s.getMarks())
                        .append("\n");
            }

            if (sb.length() == 0) {
                sb.append("No Students Found!");
            }

            JOptionPane.showMessageDialog(this, sb.toString());
        });
    }
}