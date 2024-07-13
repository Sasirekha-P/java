package Calculator;
public class Main {
    public static void main(String[] args) {
        Salary mySalary = new Salary();
        System.out.println("Addition: " + mySalary.addition(10, 5));
        System.out.println("Subtraction: " + mySalary.subtraction(10, 5));
        System.out.println("Multiplication: " + mySalary.multiplication(10, 5));
        System.out.println("Modulo: " + mySalary.modulo(10, 3));
        double salary = 50000; 
        System.out.println("Basic Pay: " + mySalary.calculateBasicPay(salary));
        System.out.println("HRA: " + mySalary.calculateHRA(salary));
    }
}
