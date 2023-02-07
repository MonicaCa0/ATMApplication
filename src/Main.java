import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://postgres:5432/database",
                    "postgres",
                    "postgres1"
            );
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database");
            e.printStackTrace();

        }
    }
}