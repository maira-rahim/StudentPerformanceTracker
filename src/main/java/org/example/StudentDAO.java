import java.sql.*;

public class StudentDAO {

    public void addStudent(Student student){

        try{

            Connection con = DatabaseConnection.getConnection();

            String query =
                    "insert into students(name,email,department) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1,student.getName());

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}