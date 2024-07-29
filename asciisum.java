import java.io.*;
import java.util.*;
public class asciisum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] str=input.split(" ");
        for(String s:str){
            int sum=0;
            for(char ch:s.toCharArray()){
                sum+=(int) ch;
            }
            System.out.print(sum);
            System.out.print(" ");
        }
    }
}
