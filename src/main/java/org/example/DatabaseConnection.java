import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static Connection connection;

    public static Connection getConnection() {

        try {

            if(connection == null){

                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student_tracker",
                        "root",
                        "root"
                );
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}