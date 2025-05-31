import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Name: ");
        String fname = input.nextLine();

        System.out.print("Middle Name: ");
        String mname = input.nextLine();

        System.out.print("Last Name: ");
        String lname = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        String password = "" + fname.charAt(0) + mname.charAt(0) + lname.charAt(0) + age;

        System.out.println("Password: " + password);
        System.out.println("Yashaswi Reddy 24351 CSE-C");

        input.close();
    }
}
