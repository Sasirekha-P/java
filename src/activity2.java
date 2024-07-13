import java.io.*;
import java.util.*;
public class activity2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        String str2="";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            str1=str1+ch[i];
        }
        for(int j=ch.length-1;j>=ch.length/2;j--){
            str2=str2+ch[j];
        }
        System.out.print(str1+str2);
    }        
}
