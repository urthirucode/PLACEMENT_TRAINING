import java.util.Scanner;

public class Problem04_MiddleElement {
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

        if (n % 2 != 0) {
            int mid = n / 2;
            System.out.println("Middle element (at index " + mid + "): " + arr[mid]);
        } else {
            int mid1 = (n / 2) - 1;
            int mid2 = n / 2;
            System.out.println("Middle elements (even size): " + arr[mid1] + " (index " + mid1 + ") and " + arr[mid2] + " (index " + mid2 + ")");
            System.out.println("Primary middle element (n / 2): " + arr[mid2]);
        }

        sc.close();
    }
}
