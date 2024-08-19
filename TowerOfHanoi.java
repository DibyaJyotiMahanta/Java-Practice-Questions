
import java.util.Scanner;

public class TowerOfHanoi {

    static void towerOfHanoi(int n, String src, String helper, String destination){
        if(n==1){
            System.out.println("transfering disk "+n+" from "+src+" to "+destination);
            return;
        }
       towerOfHanoi(n-1, src, destination, helper);
       System.out.println("transfering disk "+n+" from "+src+" to "+destination);
       towerOfHanoi(n-1, helper, src, destination);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of disk ");
            int n = sc.nextInt();
            towerOfHanoi(n,"A","B", "C");
        }

    }
}
