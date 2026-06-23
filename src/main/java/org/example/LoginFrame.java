package org.example;

import javax.swing.*;
import java.sql.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Login");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();

        JButton login = new JButton("Login");

        userLabel.setBounds(30, 50, 100, 30);
        user.setBounds(120, 50, 130, 30);

        passLabel.setBounds(30, 100, 100, 30);
        pass.setBounds(120, 100, 130, 30);

        login.setBounds(120, 150, 100, 30);

        add(userLabel);
        add(passLabel);
        add(user);
        add(pass);
        add(login);

        setSize(320, 250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        login.addActionListener(e -> {

            try {
                Connection conn = DatabaseConnection.getConnection();

                String sql =
                        "SELECT role FROM users WHERE username=? AND password=?";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, user.getText());
                ps.setString(2, String.valueOf(pass.getPassword()));

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    String role = rs.getString("role");

                    if (role.equalsIgnoreCase("TEACHER")) {
                        new TeacherDashboard();
                    } else {
                        new StudentDashboard();
                    }

                    dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Login");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}