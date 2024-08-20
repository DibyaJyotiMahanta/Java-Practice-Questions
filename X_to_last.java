import java.util.Scanner;

public class X_to_last {

    static String pushX(String str, int pointer, String newStr) {
        if (pointer == str.length()) {
            return newStr;
        }

        char c = str.charAt(pointer);
        if (c != 'X' && c != 'x') {
            newStr = c + newStr;
        } else {
            newStr = newStr + c;
        }

        return pushX(str, pointer + 1, newStr);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(pushX(str, 0, ""));
        }
    }
}
