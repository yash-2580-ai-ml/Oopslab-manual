import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter the principal amount: ");
        float P = input.nextFloat();

        System.out.print("Enter the rate of interest: ");
        float R = input.nextFloat();

        System.out.print("Enter the time in years: ");
        float T = input.nextFloat();

        // Calculating simple interest
        float SI = (P * R * T) / 100;

        // Displaying the result
        System.out.println("Simple interest is: " + SI);

        // Closing the scanner to prevent resource leaks
        input.close();
    }
}
