import java.io.*;
import java.util.ArrayList;
public class removeduplicatesarraylist {
    public static void main(String args[]){
        ArrayList obj=new ArrayList();
        obj.add("344");
        obj.add("566");
        obj.add("879");
        obj.add("344");
        obj.add("23");
        obj.add("23");
        //obj.remove(3);
        int length=obj.size();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(obj.get(i)==obj.get(j)){
                    obj.remove(i);
                    i=0;j=0;
                    length=length-1;
                }
            }
        }
        System.out.print(obj);
    }
}
