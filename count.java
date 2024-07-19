import java.io.*;
import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int upper=0,lower=0,number=0,specialcharacter=0,space=0,vowels=0;
        String vowelslist="AEIOUaeiou";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                upper++;
                if (vowelslist.indexOf(ch) != -1) {
                    vowels++;
                }
            }
            else if(ch >= 'a' && ch <='z'){
                lower++;
                if (vowelslist.indexOf(ch) != -1) {
                    vowels++;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                number++;
            }
            else if(ch == ' '){
                space++;
            }
            else{
                specialcharacter++;
            }
        }
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Special characters: " + specialcharacter);
        System.out.println("Spaces: " + space);
        System.out.println("Vowels: " + vowels);
    }
}
