import java.util.ArrayList;
import java.util.Scanner;


public class Inseration_at_the_end_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrList = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        
        System.out.println("Enter " + n + " elements:");         // Input existing elements
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arrList.add(sc.nextInt());
        }

       
        System.out.print("Enter element to insert at end: ");   // Insert new element at end
        int element = sc.nextInt();
        arrList.add(element);                                    // ArrayList automatically handles insertion

        
        System.out.println("\nArrayList after insertion:");    // Display ArrayList
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        sc.close();
    }
}

