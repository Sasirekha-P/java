package JDBC;
import java.sql.*;
public class view {
    public void view(String tableName) {
        JDBC jdbc = new JDBC();
        Connection conn = jdbc.getConnection();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM " + tableName;
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }
            } catch (SQLException e) {
                System.err.println("SQL error occurred while retrieving data.");
                e.printStackTrace();
            } finally {
                jdbc.closeConnection();
            }
        } else {
            System.err.println("Failed to establish the connection.");
        }
    }
}