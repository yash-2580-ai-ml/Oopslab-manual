class Calculatoroverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class loading {
    public static void main(String[] args) {
System.out.println("Yashaswi Reddy 24351 CSE-C");
        Calculatoroverloading c = new Calculatoroverloading();

        System.out.println("Sum of two int values: " + c.add(5, 4));
        System.out.println("Sum of two double values: " + c.add(5.9, 4.9));
        System.out.println("Sum of three int values: " + c.add(5, 4, 9));
    }
}
