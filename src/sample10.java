import java.util.*;
public class sample10 {
    public static void main(String args[])
    {
        int rows,cols;
        int a[][]={{4,2,3},{2,6,4},{6,4,2}};
        rows=a.length;
        cols=a.length;
        if(rows!=cols)
        {
            System.out.println("Matrix should be a square matrix");
        }
        else
        {
            System.out.println("Lower triangular matrix");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(j>i)
                        System.out.print("0");
                    else
                        System.out.print(a[i][j]+"");
                }
                System.out.println();
            }
        }
    }
}
