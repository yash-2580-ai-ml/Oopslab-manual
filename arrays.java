import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);  
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));
        String[] strArray = {"Apple", "Orange", "Banana", "Grape"};
        System.out.println("Original String array: " + Arrays.toString(strArray));
        Arrays.sort(strArray); 
        System.out.println("Sorted String array: " + Arrays.toString(strArray));
        String intArrayString = Arrays.toString(intArray);
        System.out.println("Integer array as a string: " + intArrayString);
        String strArrayString = Arrays.toString(strArray);
        System.out.println("String array as a string: " + strArrayString);
        Integer[] fillArray = new Integer[10];
        Arrays.fill(fillArray, 5);  
        System.out.println("Array filled with 5: " + Arrays.toString(fillArray));
        Arrays.fill(fillArray, 2, 6, 10);  
        System.out.println("Array filled: " + Arrays.toString(fillArray));
        Integer[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied Integer array: " + Arrays.toString(copiedArray));
        String[] copiedStrArray = Arrays.copyOf(strArray, strArray.length);
        System.out.println("Copied String array: " + Arrays.toString(copiedStrArray));
 	System.out.println("Yashaswi Reddy 24351 CSE-C");
    }}

