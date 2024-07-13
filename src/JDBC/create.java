package JDBC;
import java.sql.*;
public class create {
    public void create(String tableName) {
        JDBC jdbc = new JDBC();
        Connection conn = jdbc.getConnection();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "name VARCHAR(255) NOT NULL, " +
                        "age INT NOT NULL)";
                stmt.executeUpdate(sql);
                System.out.println("Table '" + tableName + "' created successfully!");
            } catch (SQLException e) {
                System.err.println("SQL error occurred while creating the table.");
                e.printStackTrace();
            } finally {
                jdbc.closeConnection();
            }
        } else {
            System.err.println("Failed to establish the connection.");
        }
    }
}