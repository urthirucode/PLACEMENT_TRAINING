import java.util.Scanner;

public class Problem10_LastEvenNumber {
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

        boolean found = false;
        // Search backwards from the last element to find the last even number
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.println("Last even number: " + arr[i] + " (found at index " + i + ")");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No even number found in the array.");
        }

        sc.close();
    }
}
