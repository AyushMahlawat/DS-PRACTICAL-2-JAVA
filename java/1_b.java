import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Array");
            System.out.println("2. Insert Element at Specified Position");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArray(array);
                    break;
                case 2:
                    insertElement(array, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        System.out.print("Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void insertElement(int[] array, Scanner scanner) {
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        if (position < 1 || position > array.length + 1) {
            System.out.println("Invalid position. Position should be between 1 and " + (array.length + 1));
            return;
        }

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        // Shift elements to make space for the new element
        for (int i = array.length - 1; i >= position - 1; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element at the specified position
        array[position - 1] = element;

        System.out.println("Element inserted successfully.");
    }
}
