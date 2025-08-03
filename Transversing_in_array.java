import java.util.Scanner;



public class Transversing_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");         // Input elements into array
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        
        System.out.println("\nChecking elements:");           // Traverse and check each element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println("Element at index " + i + " is Positive (" + arr[i] + ")");
            } else if (arr[i] < 0) {
                System.out.println("Element at index " + i + " is Negative (" + arr[i] + ")");
            } else {
                System.out.println("Element at index " + i + " is Zero");
            }
        }

        sc.close();
    }
}


