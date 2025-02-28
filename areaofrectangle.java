import java.util.Scanner;

class areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of the rectangle: ");
        float x = input.nextFloat();
        System.out.print("Width of the rectangle: ");
        float y = input.nextFloat();
        float area = x * y;
        System.out.println("The area of the rectangle: " + area);
    }
}
