import java.io.*;
import java.util.*;
public class adjacentnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(removeduplicates(input));
    }
    public static String removeduplicates(String input){
        char[] ch=input.toCharArray();
        int N=ch.length;
        int i=0;
        for(int j=0;j<N;j++){
            if(i>0 && ch[i-1]==ch[j]){
                i--;
            }
            else{
                ch[i]=ch[j];
                i++;
            }
        }
        return new String(ch,0,i);
    }
}