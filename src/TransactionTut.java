import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TransactionTut {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "kammo@123";
        String withdrowQuery = "UPDATE accounts SET balance=balance -? WHERE account_no=?";
        String depositQuery = "UPDATE accounts SET balance=balance +? WHERE account_no=?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
            con.setAutoCommit(false);

            try {
                PreparedStatement withdrowStatement = con.prepareStatement(withdrowQuery);
                PreparedStatement depositStatement = con.prepareStatement(depositQuery);
                withdrowStatement.setDouble(1,4200);
                withdrowStatement.setString(2, "account123");
                depositStatement.setDouble(1, 1000);
                depositStatement.setString(2, "account450");
                withdrowStatement.executeUpdate();
                depositStatement.executeUpdate();
                con.commit(); // to commit the details
                System.out.println("Transaction successfull");
            } catch (SQLException e) {
                con.rollback();
                System.out.println("Transaction failed !");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}