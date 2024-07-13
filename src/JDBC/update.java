package JDBC;
import java.sql.*;
import java.util.Scanner;
public class update {
    public void update(String tableName) {
        JDBC jdbc = new JDBC();
        Connection conn = jdbc.getConnection();
        if (conn != null) {
            try {
                Scanner scanner = new Scanner(System.in);
                String sql = "INSERT INTO " + tableName + " (id,name, age) VALUES (?,?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                pstmt.setString(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, age);
                pstmt.executeUpdate();
                System.out.println("Data inserted successfully!");
                scanner.close();
            } catch (SQLException e) {
                System.err.println("SQL error occurred while inserting data.");
                e.printStackTrace();
            } finally {
                jdbc.closeConnection();
            }
        } else {
            System.err.println("Failed to establish the connection.");
        }
    }
}