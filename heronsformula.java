import java.util.Scanner;

class HeronsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        double s = (a + b + c) / 2;
        System.out.println("s is the value of semi-perimeter: " + s);

        double x = s * (s - a) * (s - b) * (s - c);
        System.out.println("The value of x is: " + x);

        double area = Math.sqrt(x);
        System.out.println("The area of the triangle is: " + area);

        input.close();
    }
}
