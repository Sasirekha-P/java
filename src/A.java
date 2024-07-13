interface i1 {
    int a = 10;
    void show();
}
interface i2 extends i1 {
    int b = 100;
    void display();
}
class A implements i2 {
    public void show() {
    }
    public void display() {
    }
    public static void main(String[] args) {
        System.out.println(i1.a + i2.b);
    }
}
