import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton login = new JButton("Login");

        user.setBounds(50,50,150,30);
        pass.setBounds(50,100,150,30);
        login.setBounds(50,150,100,30);

        add(user);
        add(pass);
        add(login);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

        login.addActionListener(e -> {
            if(user.getText().equals("admin") &&
                    String.valueOf(pass.getPassword()).equals("123")) {

                JOptionPane.showMessageDialog(this, "Login Success");
                new TeacherDashboard();

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });
    }
}