import java.util.Scanner;

class Calculator {
    public void add(double a, double b) {
      System.out.println("Sum of two numbers is: " + (a + b));
    }

    public void subs(double a, double b) {
        System.out.println("Difference of two numbers is: " + (a - b));
    }
}

class Calculator1 extends Calculator {
    public void mul(double a, double b) {
        System.out.println("Multiplication of two numbers is: " + (a * b));
    }
}

class Calculator2 extends Calculator1 {
    public void div(double a, double b) {
        if (b == 0) {
            System.out.println("Division is not allowed when b = 0");
        } else {
            System.out.println("Division of two numbers is: " + (a / b));
        }
    }
}

public class Cals {
    public static void main(String[] args) {
        Calculator2 C = new Calculator2();
        Scanner input = new Scanner(System.in);

        System.out.println("Yashaswi reddy 24351 CSE-C");
	System.out.println("Enter two numbers:");
        double a = input.nextDouble();
        double b = input.nextDouble();

        C.add(a, b);
        C.subs(a, b);
        C.div(a, b);
        C.mul(a, b);
    }
}
