import java.util.Scanner;

public class Problem02_OddIndex {
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
            System.out.println("No odd indexes exist for an array of size " + n);
        } else {
            System.out.println("Elements at odd indexes (1, 3, 5, ...):");
            for (int i = 1; i < n; i += 2) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
