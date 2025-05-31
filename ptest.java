abstract class patternprinter {
    abstract void printpattern(int n);
    public void displayTitle(String title) {
        System.out.println(title);
    }
}
class starpattern extends patternprinter {
    public void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");}
            System.out.println();
        }}}
class NumberPattern extends patternprinter {
    public void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");}
            System.out.println();
        } }}
public class ptest {
    public static void main(String[] args) {
        System.out.println("YashaswiReddy 24351 CSE-C");
        int n = 5; 
        patternprinter str = new starpattern();
        star.displayTitle("Star Pattern");
        star.printpattern(n);
        System.out.println();
        patternprinter number = new NumberPattern();
        number.displayTitle("Number Pattern");
        number.printpattern(n);
    }}
