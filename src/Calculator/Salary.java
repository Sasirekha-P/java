package Calculator;
public class Salary {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public double calculateBasicPay(double salary) {
        return 0.4 * salary;
    }

    public double calculateHRA(double salary) {
        return 0.2 * salary;
    }
}
