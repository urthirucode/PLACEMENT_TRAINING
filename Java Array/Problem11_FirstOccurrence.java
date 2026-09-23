import java.util.Scanner;

public class Problem11_FirstOccurrence {
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

        int firstIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                firstIndex = i;
                break;
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex + " (Position: " + (firstIndex + 1) + ")");
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }
}
