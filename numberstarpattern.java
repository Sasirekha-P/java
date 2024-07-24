import java.io.*;
import java.util.*;
public class numberstarpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                for(int j=1;j<=N;j++){
                    if(j%2!=0){
                        System.out.print(i);
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            else{
                for(int j=1;j<=N;j++){
                    if(j%2!=0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }
}
