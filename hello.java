

import java.util.Scanner;
public class hello {
    public static void up_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void down_triangle(int n){
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number dalo: ");
            int n = sc.nextInt();
            up_triangle(n);
            down_triangle(n);
        }
    }
}
