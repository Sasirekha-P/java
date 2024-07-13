import java.util.*;
public class sample4
{
    public static void main(String args[])
    {
        int[] numbers = new int[10];
        int oddcount = 0;
        int evencount = 0;
        for(int i = 0; i < 10; i++)
        {
            if(i<5)
            {
                numbers[i]=2*i+1;
            }
            else
            {
                numbers[i]=2*(i-4);
            }
        }
       
        for(int i=0;i<5;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
        for(int i=5;i<10;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
