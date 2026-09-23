import java.util.Scanner;

public class Problem13_CountIncreasingPairs {
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

        if (n < 2) {
            System.out.println("At least 2 elements are required to form adjacent pairs.");
            sc.close();
            return;
        }

        int count = 0;
        System.out.println("Increasing adjacent pairs:");
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println("(" + arr[i] + ", " + arr[i + 1] + ")");
                count++;
            }
        }

        System.out.println("Total count of increasing adjacent pairs: " + count);

        sc.close();
    }
}
