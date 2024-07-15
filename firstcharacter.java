import java.io.*;
import java.util.*;
public class firstcharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input="Hi I am Sasirekha from Sankagiri";
        String[] words=input.split(" ");
        for(String word:words){
            if(word.length()>0){
                System.out.print(word.charAt(0)+" ");
            }
        }
        System.out.println();
    }
}
