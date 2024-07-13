import java.util.*;
public class sample3 {

    public static void main(String[] args) {
        int n = 10;
        
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (i < min1) {
                min1 = i;
            }
            if (i > max1) {
                max1 = i;
            }
        
            if (i < min2) {
                min1 = i;
            }
            if (i > max1) {
                max1 = i;
            }
        }
        System.out.println("First Minimum up to " + n + ": " + min1);
        System.out.println("First Maximum up to " + n + ": " + max1);
        System.out.println("Second Minimum up to " + n + ": " + min2);
        System.out.println("Second Minimum up to " + n + ": " + min2);
    }
}
