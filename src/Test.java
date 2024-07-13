package Employee;
import Employee.salary.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Enter Employee name: ");
        String name=s.nextLine();
        System.out.println("Enter Employee department: ");
        String dept=s.nextLine();
        System.out.println("Enter Employee designation: ");
        String desig=s.nextLine();
        System.out.println("Enter Employee Basic Salary: ");
        int Basicpay=s.nextInt();
        salary e1=new salary(id,name,dept,desig,Basicpay);
        e1.calculate_Salary();
    }
}