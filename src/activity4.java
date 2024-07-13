public class activity4 {
    public static void main(String[] args) {
        String input = "ab17c3d";
        int result = sumIntegersInString(input);
        System.out.println(result);
    }
    public static int sumIntegersInString(String str) {
        int sum = 0;
        int currentNumber = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } else {
                sum += currentNumber;
                currentNumber = 0; 
            }
        }
        sum += currentNumber;
        return sum;
    }
}