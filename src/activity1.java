import java.io.*;
import java.util.*;
public class activity1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String string1="Hello";
        String string2="World";
        String string3="";
        char[] ch=string2.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            string3=string3+ch[i];
        }
        System.out.print(string1+string3);
    }
}
