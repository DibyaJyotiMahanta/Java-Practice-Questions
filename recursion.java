import java.util.Scanner;
public class recursion {
    static void calculate(int max_range){
        if(max_range==0){
            return;
        }
    
        calculate(max_range-1);
        System.out.print(max_range);

    }
    public static void main(String[] args) {
        System.out.print("Enter the max range ");
        try (Scanner sc = new Scanner(System.in)) {
            calculate(sc.nextInt());
        }
    }
}
