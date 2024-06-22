
import java.util.Scanner;

public class balti {

    static void Balti(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            num--;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENter the number");
            int n = sc.nextInt();
            Balti(n);
        }
    }
}
