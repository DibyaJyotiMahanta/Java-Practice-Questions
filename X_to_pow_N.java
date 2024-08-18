import java.util.Scanner;
public class X_to_pow_N {

static void calculate(int base, int n){
    if(n==0){
        return;
    }
    calculate(base, n-1);
    System.out.println(Math.pow(base,n));
    

}

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter base");
            int base = sc.nextInt();
            System.out.println("Enter n");
            int n = sc.nextInt();
            calculate(base, n);
        }
    }
}
