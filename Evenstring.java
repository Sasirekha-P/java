import java.io.*;
import java.util.*;
public class Evenstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input="Hi I am Sasirekha from Sankagiri";
        String[] words=input.split(" ");
        for(String word:words){
            int length=word.length();
            System.out.println("Word:"+word+",length:"+length);
            if(length%2==0){
                System.out.println("Even length word:"+word);
            }
        }    
    }
}