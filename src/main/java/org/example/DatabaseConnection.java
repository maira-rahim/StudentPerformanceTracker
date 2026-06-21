import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://mysql.railway.internal:3306/railway";

    private static final String USER = "root";
    private static final String PASSWORD = "rLHRsuVaGtFpCmExIHLXwWNaEkVAObQu";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            System.out.println("DB Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}