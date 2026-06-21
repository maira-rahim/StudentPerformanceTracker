package org.example;

import javax.swing.*;

public class StudentDashboard extends JFrame {

    public StudentDashboard() {

        setTitle("Student Dashboard");

        JLabel label = new JLabel("Welcome Student");

        label.setBounds(80, 50, 200, 30);

        add(label);

        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}