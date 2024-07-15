import java.io.*;
import java.util.*;
public class wrapperclass {
    public static void main(String args[]){
        int i=10;
        Integer obj1=new Integer(i);
        System.out.println(obj1);
        char ch='a';
        Character obj2=new Character(ch);
        System.out.println(obj2);
        float f=10.2f;
        Float obj3=new Float(f);
        System.out.println(obj3);
        double d=12d;
        Double obj4=new Double(d);
        System.out.println(obj4);
        long l=3;
        Long obj5=new Long(l);
        System.out.println(obj5);
        byte b=3;
        Byte obj6=new Byte(b);
        System.out.println(obj6);
        short s=100;
        Short obj7=new Short(s);
        System.out.println(obj7);
        boolean boolvalue=true;
        Boolean obj8=new Boolean(boolvalue);
        System.out.println(obj8);
    }
}
