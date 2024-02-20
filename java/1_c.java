import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Array");
            System.out.println("2. Delete Element from Specified Position");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArray(array);
                    break;
                case 2:
                    deleteElement(array);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void deleteElement(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position to delete (1 to " + array.length + "): ");
        int position = scanner.nextInt();

        if (position < 1 || position > array.length) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
            for (int i = position - 1; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0; // Set the last element to 0 (or update based on your requirement)
            System.out.println("Element at position " + position + " deleted successfully.");
        }
    }
}
