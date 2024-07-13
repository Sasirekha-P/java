package JDBC;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the table name: ");
        String tableName = scanner.nextLine();
        create createTable = new create();
        createTable.create(tableName);
        update updateTable = new update();
        updateTable.update(tableName);
        view viewTable = new view();
        viewTable.view(tableName);
        scanner.close();
    }
}