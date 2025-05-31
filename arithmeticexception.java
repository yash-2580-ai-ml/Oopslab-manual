public class arithmeticexception {
    public static void main(String[]args) {
        int num = 10;
        int den = 0;
        try {
            int result = num/den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Excetpion: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
            System.out.println("Yashaswi Reddy 24351 CSE-C");
    }
}
