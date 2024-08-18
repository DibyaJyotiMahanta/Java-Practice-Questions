import java.util.Scanner;
public class SumOfNNaturalNumber {

static int calculate(int n){
    if(n==0){
        return n;
    }
    int sum = n+calculate(n-1);
    return sum;
}



    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the quantity of first n natural numbers ");
            int n = sc.nextInt();
            System.out.println(calculate(n));
        }

    }
}
