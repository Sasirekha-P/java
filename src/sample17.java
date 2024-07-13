import java.util.*;
public class sample17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String cleanedStr = n.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = cleanedStr.toCharArray();
        boolean flag = true;  
        int i, j;
        for (i = 0, j = c.length - 1; i < j; i++, j--) {
            if (c[i] != c[j]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        s.close();  
    }
}