import java.util.Scanner;

public class Fibonacci {
    static void calculate(int n, int[] arr, int pointer1, int pointer2, int pointer3) {
        if (n > 2) {
            arr[pointer3] = arr[pointer1] + arr[pointer2];
            pointer1++;
            pointer2++;
            pointer3++;
            calculate(n - 1, arr, pointer1, pointer2, pointer3);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            

            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;

            calculate(n, arr, 0, 1, 2);

            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
