import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float ftemp = input.nextFloat();
        float ctemp = (ftemp - 32) * 5 / 9;
        System.out.println("Conversion of Fahrenheit to Celsius: " + ctemp);
        input.close();
    }
}
