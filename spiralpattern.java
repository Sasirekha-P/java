public class spiralpattern {
    public static void main(String[] args) {
        int n = 7; 
        for (int i = 0; i < n; i++) {//row
            for (int j = 0; j < n; j++) //column 
            {
                int value = 4;
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    value = 4;
                } else if (i == 1 || i == n - 2 || j == 1 || j == n - 2) {
                    value = 3;
                } else if (i == 2 || i == n - 3 || j == 2 || j == n - 3) {
                    value = 2;
                } else if (i == 3 || i == n - 4 || j == 3 || j == n - 4) {
                    value = 1;
                }
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
    }
}
