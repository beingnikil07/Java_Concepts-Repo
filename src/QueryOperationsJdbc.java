import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryOperationsJdbc {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
            // Loading all drivers from com.mysql.jdbc package
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Databse url
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "kammo@123";
        try {
            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
            Statement st = con.createStatement();
            String query = "select * from employee";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("eid");
                String name = rs.getString("name");
                Double salary = rs.getDouble("salary");
                String city = rs.getString("city");
                System.out.println("-----------------------------------------");
                System.out.println("Id:" + id);
                System.out.println("Name:" + name);
                System.out.println("Salary:" + salary);
                System.out.println("City:" + city);
            }
            st.close();
            con.close();
            rs.close();
            System.out.println("Resources closed successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
