import javax.swing.*;

public class TeacherDashboard extends JFrame {

    public TeacherDashboard() {

        JButton add = new JButton("Add Student");
        JButton view = new JButton("View Students");

        add.setBounds(50,50,150,30);
        view.setBounds(50,100,150,30);

        add(add);
        add(view);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

        add.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Name:");
            String course = JOptionPane.showInputDialog("Course:");
            double marks = Double.parseDouble(JOptionPane.showInputDialog("Marks:"));

            StudentDAO dao = new StudentDAO();
            dao.addStudent(new Student(0,name,course,marks));
        });

        view.addActionListener(e -> {
            StudentDAO dao = new StudentDAO();
            StringBuilder sb = new StringBuilder();

            for(Student s : dao.getAllStudents()) {
                sb.append(s.getId())
                        .append(" ")
                        .append(s.getName())
                        .append(" ")
                        .append(s.getMarks())
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, sb.toString());
        });
    }
}