import java.util.*;
public class activity3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = s.nextLine();
        System.out.println("Enter second string:");
        String str2 = s.nextLine();
        System.out.print("Non-repeating characters in str1: ");
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            boolean check = false;
            for (int j = 0; j < str2.length(); j++) {
                if (c == str2.charAt(j)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}