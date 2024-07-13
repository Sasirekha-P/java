import java.util.ArrayList;
public class ArrayListEmptyCheck {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
        arrayList.add(10);
        arrayList.add(20);
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}
