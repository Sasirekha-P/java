import java.io.*;
public class Exception {
    public static void main(String[] args) {
        String str = null;
        String numStr = "123.55";
        String indexStr = "Welcome";
        try {
            int length = str.length(); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
        try {
            int num = Integer.parseInt(numStr); 
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
        try {
            char character = indexStr.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}