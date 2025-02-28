import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to be displayed: ");
        int num = input.nextInt();
        int first = 0, second = 1, third;
        
        System.out.println("Fibonacci series for " + num + " terms:");
        System.out.println(first);
        System.out.println(second);
        
        for (int i = 3; i <= num; ++i) {
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
        }

        input.close();
    }
}
