import java.util.Scanner;

public class Reverse_a_String {

static void reverse(String s, int n){
    if(n==0){
        return;
    }
    System.out.print(s.charAt(n-1));
        reverse(s,n-1);
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            reverse(s, 3);
        }
    }
}
