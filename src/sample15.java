import java.util.*;
public class sample15 {
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        System.out.println("After reverse the string");
        for(int i=s.length();i>0;--i)
        {
            System.out.println(s.charAt(i-1));
        }
    }
}
