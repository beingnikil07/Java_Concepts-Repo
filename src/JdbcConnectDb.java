import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnectDb {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement st = null;
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "employee";
            String username = "root";
            String password = "kammo@123";

            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            
            // Note: Removed 'Create database' from the SQL query
            String sql = "CREATE DATABASE " + databaseName;
            st.execute(sql);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
