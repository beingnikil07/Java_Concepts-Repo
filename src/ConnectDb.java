import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class ConnectDb {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/students";

        // Database credentials
        String username = "root";
        String password = "kammo@123";

        // Establish the connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.err.println("Connection failed:" + e.getMessage());
        }
    }
}