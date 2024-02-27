import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatchProcessing {
    public static void main(String[] args) throws Exception {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        // Database credentials
        String username = "root";
        String password = "kammo@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Establish the connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established successfully");
            // we don't want initial commit
            con.setAutoCommit(false);
            Statement st = con.createStatement();
            // using batch processing
            st.addBatch("insert into students(sid,name,fname,age) values(001,'nik','sanjay',25)");
            st.addBatch("insert into students(sid,name,fname,age) values(002,'mik','rajiv',42)");;
            int[] batchResult = st.executeBatch();
            con.commit();
            System.out.println("Batch executed successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}