import java.util.Scanner;
public class Factorial_of_N {

static int calculate(int n){
    if(n==1){
        return n;
    }
    int factorial = n*calculate(n-1);
    return factorial;
}


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println(calculate(sc.nextInt()));
        }
    }
}
