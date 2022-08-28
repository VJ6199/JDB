import java.sql.*;

public class PreparedInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/CRICKET";
        String username = "root";
        String password = "JanVij@2021";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps= connection.prepareStatement("insert into performance values(?,?,?,?)");
        ps.setString(1, "Kane williamson");
        ps.setString(2, "New Zealand");
        ps.setInt(3, 13478);
        ps.setInt(4, 176);
        ps.executeUpdate();
    }
}