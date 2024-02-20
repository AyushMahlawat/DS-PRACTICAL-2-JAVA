import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the menu
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Linear Search
                    System.out.print("Enter the element to search: ");
                    int searchElement = scanner.nextInt();
                    int result = linearSearch(array, searchElement);
                    if (result != -1) {
                        System.out.println("Element found at index " + result);
                    } else {
                        System.out.println("Element not found in the array");
                    }
                    break;
                case 2:
                    // Exit
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);

        scanner.close();
    }

    // Linear Search method
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}
