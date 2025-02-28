import java.util.Scanner;

class Temp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float ctemp = input.nextFloat();
        float ftemp = (ctemp * 9 / 5) + 32;
        System.out.println("Conversion Celsius to Fahrenheit: " + ftemp);
        input.close();
    }
}
