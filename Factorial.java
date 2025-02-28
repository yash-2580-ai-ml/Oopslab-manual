import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int n1 = n;
        int sum = 1;

        while (n > 0) {
            sum *= n;
            n--;
        }

        System.out.println("The factorial of " + n1 + " is " + sum);
        input.close();
    }
}
