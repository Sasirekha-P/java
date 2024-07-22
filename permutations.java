import java.util.*;
public class permutations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        generatepermutations(input," ");
    }
    public static void generatepermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String str1=str.substring(0,i)+str.substring(i+1);
            generatepermutations(str1,permutation+ch);
        }
    }
}
