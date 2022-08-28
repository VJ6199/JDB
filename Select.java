import java.sql.*;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/CRICKET";
        String username = "root";
        String password = "JanVij@2021";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from performance");
        while (rs.next()) {
            System.out.println(rs.getString("player_name") + " " + rs.getString("player_team") + " " + rs.getInt("player_runs") + " " + rs.getString("player_best") + "");
        }
    }
}