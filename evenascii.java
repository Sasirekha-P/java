import java.io.*;
import java.util.*;
public class evenascii {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        printevenascii(input);
    }
    public static void printevenascii(String input){
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if((int)c%2==0){
                System.out.print(c);
            }
        }
    }
}
