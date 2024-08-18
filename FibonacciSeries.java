import java.util.Scanner;
public class FibonacciSeries {

static void calculate(int n){
    if(n==0){
        return;
    }
   
    calculate(n-1);
    System.out.println(n + n-1);
}

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number ");
            calculate(sc.nextInt());
        }
    }
}
