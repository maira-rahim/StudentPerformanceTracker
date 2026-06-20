import javax.swing.*;

public class LoginFrame extends JFrame {

    JTextField username;
    JPasswordField password;
    JButton loginBtn;

    public LoginFrame() {

        setTitle("Student Academic Performance Tracker");

        username = new JTextField();
        password = new JPasswordField();
        loginBtn = new JButton("Login");

        setLayout(null);

        username.setBounds(100,50,200,30);
        password.setBounds(100,100,200,30);
        loginBtn.setBounds(150,150,100,30);

        add(username);
        add(password);
        add(loginBtn);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
