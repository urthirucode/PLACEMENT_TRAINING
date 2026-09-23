import java.util.Scanner;

public class Problem12_LastOccurrence {
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

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int lastIndex = -1;
        // Search from end to start for last occurrence
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex + " (Position: " + (lastIndex + 1) + ")");
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }
}
