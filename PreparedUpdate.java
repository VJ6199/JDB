import java.sql.*;

public class PreparedUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/CRICKET";
        String username = "root";
        String password = "JanVij@2021";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps= connection.prepareStatement("update performance set player_runs=player_runs+? where player_best = ?");
        ps.setInt(1, 400);
        ps.setInt(2, 132);
        ps.executeUpdate();
    }
}