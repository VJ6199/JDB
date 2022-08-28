import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/CRICKET";
        String username = "root";
        String password = "JanVij@2021";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        int x = statement.executeUpdate("insert into performance values('Rohit','India','12000','210')");
        if(x!=0)
            System.out.println("data inserted");
    }
}



