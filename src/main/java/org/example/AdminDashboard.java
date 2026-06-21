package org.example;

import javax.swing.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {

        setTitle("Admin Dashboard");

        JLabel label = new JLabel("Welcome Admin");

        label.setBounds(80, 50, 200, 30);

        add(label);

        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}