import java.util.Scanner;
public class abc {
    static void abcd(int n){
        char s[]  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i =0; i<=n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        abcd(n);
        }
    }
}
