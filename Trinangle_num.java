import java.util.Scanner;

public class Trinangle_num {
    
    static void trin(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENter the number");
            int n = sc.nextInt();
            trin(n);
        }
    }
}
