import java.util.Scanner;

public class Problem06_DifferenceFirstLast {
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

        int diff = arr[0] - arr[n - 1];
        System.out.println("Front element: " + arr[0]);
        System.out.println("Last element: " + arr[n - 1]);
        System.out.println("Difference (front - last): " + diff);
        System.out.println("Absolute difference: " + Math.abs(diff));

        sc.close();
    }
}
