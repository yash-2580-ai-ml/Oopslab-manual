import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereader {
    public static void readfile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

    public static void main(String[] args) {
        String filename = "ex.txt";
        try {
            readfile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.out.println("Yashaswi Reddy 24351 CSE-C");
        }
    }
}
