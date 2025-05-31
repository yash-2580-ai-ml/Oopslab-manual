import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add(1, "Orange"); 

        System.out.println("After adding: " + fruits);

        fruits.set(2, "Mango"); 
        System.out.println("After changing: " + fruits);

        String element = fruits.get(1); // Get element at index 1
        System.out.println("Element 1: " + element);

        fruits.remove(3); 
        System.out.println("After removing: " + fruits);

        fruits.clear();
        System.out.println("After clearing: " + fruits);

        System.out.println("Yashaswi Reddy 24351 CSE-C");
    }
}
