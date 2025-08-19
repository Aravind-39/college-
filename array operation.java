import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; 
        int n;

        
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Traverse (Display)");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:// Insertion
                    System.out.print("Enter position (1 to " + (n + 1) + "): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();

                    if (pos < 1 || pos > n + 1) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = n; i >= pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos - 1] = element;
                        n++;
                        System.out.println("Element inserted.");
                    }
                    break;

                case 3:
                    
                    System.out.print("Enter position to delete (1 to " + n + "): ");
                    pos = sc.nextInt();

                    if (pos < 1 || pos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = pos - 1; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted.");
                    }
                    break;

                case 4:
                    
                    System.out.print("Enter element to search: ");
                    element = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == element) {
                            System.out.println("Element found at position: " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
