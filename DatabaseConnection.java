import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String [] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/JNIT";
        String username="root";
        String password="JanVij@2021";
        Connection connection=DriverManager.getConnection(url,username,password);
        if(connection!=null)
            System.out.println("connection established");
    }
}
