import java.util.*;
public class sample2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        if (isDecreasingOrder(arr)) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[n - 1]);
        }
    }
    public static boolean isDecreasingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}