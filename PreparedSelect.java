import java.sql.*;

public class PreparedSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/CRICKET";
        String username = "root";
        String password = "JanVij@2021";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps= connection.prepareStatement("select * from performance where player_name=?");
        ps.setString(1,"virat kohli");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("player_name") + " " + rs.getString("player_team") + " " + rs.getInt("player_runs") + " " + rs.getString("player_best") + "");
        }
    }
}