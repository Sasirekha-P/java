interface shape{
    double calculateArea();
}
class Rectangle implements shape{
    private double width;
    private double length;
    public Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public double calculateArea(){
        return width*length;
    }
}
class Triangle implements shape{
    private double base;
    private double height;
    public Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return 0.5*base*height; //1/2*base*height
    }
}
class Circle implements shape{
    private double radius;
    private final double PI=3.141;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return PI*radius*radius;
    }
}
public class program1{
    public static void main(String args[]){
        Rectangle rec=new Rectangle(15,2);
        Triangle tri=new Triangle(3,9);
        Circle cir=new Circle(5);
        System.out.println("Area of Rectangle:"+rec.calculateArea());
        System.out.println("Area of Triangle:"+tri.calculateArea());
        System.out.println("Area of Circle:"+cir.calculateArea());
    }
}