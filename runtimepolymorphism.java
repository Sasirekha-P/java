//runtime polymorphism with constructor overloading
import java.io.*;
public class runtimepolymorphism {
    runtimepolymorphism(){
        System.out.println("c1");
    }
    runtimepolymorphism(int x){
        System.out.println("c2");
    }
    void display(){
        System.out.println("display runtimepolymorphism");
    }
}
class B extends runtimepolymorphism{
    void disp(){
        System.out.println("display B");
    }
    public static void main(String args[]){
        B b1=new B();
        b1.disp();
    }
}
