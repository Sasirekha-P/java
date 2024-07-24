import java.io.*;
import java.util.*;
public class sumofdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(sumofdigits(input));
    }
    public static int sumofdigits(String str){
        int sum=0;
        int N=0;
        boolean check=false;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                N=N*10+(ch-'0');
                check =true;
            }
            else{
                sum+=N;
                N=0;
            }
        }
        sum+=N;
        return sum;
    }
}
