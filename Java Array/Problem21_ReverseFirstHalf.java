import java.util.Scanner;

public class Problem21_ReverseFirstHalf {
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

        // First half range is from index 0 to (n / 2) - 1
        int start = 0;
        int end = (n / 2) - 1;

        if (end <= 0) {
            System.out.println("Array has fewer than 2 elements in the first half; nothing to reverse.");
        } else {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Array after reversing only the first half:");
        printArray(arr);

        sc.close();
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
