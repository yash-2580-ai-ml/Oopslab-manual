interface Shape {
    double getperimeter();}
class rectangle implements Shape {
    public int l;
    public int b;
    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public double getperimeter() {
        return 2*(l+b);
    }
}
class circle implements Shape {
    public int r;
    public circle(int r) {
        this.r = r;
    }
    public double getperimeter() {
        return 2*3.14*r;
    }
}
class triangle implements Shape {
    public int a;
    public int b;
    public int c;
    public triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getperimeter() {
        return a+b+c;
    }
}
public class Shapetestt {
    public static void main(String[]args) {
        System.out.println("YashaswiReddy 24351 CSE-C");
        Shape r = new rectangle(2,3);
        Shape c = new circle(4);
        Shape t = new triangle(3,4,5);
        System.out.println("Area of Rectangle: " + r.getperimeter());
        System.out.println("Area of Circle: " + c.getperimeter());
        System.out.println("Area of Triangle: " + t.getperimeter());
    }}
