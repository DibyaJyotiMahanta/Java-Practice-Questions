import java.util.Scanner;
public class Last_First {

static void get(String str, int len){
    if(len == 0){
        System.out.print(" "+str.charAt(len));
        return;
    }
    if(len == (str.length()-1)){
        System.out.print(str.charAt(len));
    }
    get(str, len-1);
}

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            String str = s.nextLine();
            get(str, str.length()-1);
        }
    }
}
