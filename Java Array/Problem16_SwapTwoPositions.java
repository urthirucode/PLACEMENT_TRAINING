import java.util.Scanner;

public class Problem16_SwapTwoPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        System.out.print("Enter first position/index (0 to " + (n - 1) + "): ");
        int pos1 = sc.nextInt();

        System.out.print("Enter second position/index (0 to " + (n - 1) + "): ");
        int pos2 = sc.nextInt();

        if (pos1 < 0 || pos1 >= n || pos2 < 0 || pos2 >= n) {
            System.out.println("Invalid positions! Positions must be between 0 and " + (n - 1) + ".");
        } else {
            // Swap elements at pos1 and pos2
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;

            System.out.println("Array after swapping elements at index " + pos1 + " and index " + pos2 + ":");
            printArray(arr);
        }

        sc.close();
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
