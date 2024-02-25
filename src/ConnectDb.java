import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConnectDb {
    public static Connection con=null;
    public static PreparedStatement ps=null;
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/students";

        // Database credentials
        String username = "root";
        String password = "kammo@123";

        // Establish the connection
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
            System.out.println(con);  //it will print the connection id
            ps=con.prepareStatement("insert into students values(001,'nikhil','dhampur')");            
            int i=ps.executeUpdate();
            if(i>=1){
                System.out.println("Record Inserted");
            }else{
                System.out.println("Try again");
            }
         } catch (SQLException e) {
            System.err.println("Connection failed:" + e.getMessage());
        }
    }
}