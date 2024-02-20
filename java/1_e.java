import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = null;

        while (true) {
            System.out.println("1. Input Array");
            System.out.println("2. Update Array");
            System.out.println("3. Display Array");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    array = inputArray(scanner);
                    break;
                case 2:
                    if (array == null) {
                        System.out.println("Error: Array not initialized. Please input the array first.");
                    } else {
                        updateArray(array);
                        System.out.println("Array updated successfully.");
                    }
                    break;
                case 3:
                    displayArray(array);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static int[] inputArray(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static void updateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] += 5;
            } else {
                array[i] *= 2;
            }
        }
    }

    private static void displayArray(int[] array) {
        if (array == null) {
            System.out.println("Error: Array not initialized.");
        } else {
            System.out.print("Array elements: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
