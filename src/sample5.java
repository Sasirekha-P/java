import java.util.*;
public class sample5
{
    public static void main(String args[])
    {
        int arr[];
        int max=0;
        int x=-1,y=-1;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]-arr[j]>max)
                {
                    max=arr[j]-arr[i];
                    x=j;
                    y=j;
                }
            }
        System.out.println("The maximum profit if bought on "+(x+1)+" and sold on "+(y+1)+"and profit "+max);
    }
}