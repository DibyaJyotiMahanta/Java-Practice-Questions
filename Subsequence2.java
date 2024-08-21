
import java.util.HashSet;

public class Subsequence2 {

    static void subsequence(String str, int indx, String newStr, HashSet<String> set) {
        if (indx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        char c = str.charAt(indx);
        //aana chahta hai toh
        subsequence(str, indx + 1, newStr + c, set);

        //ni aana chahta hai toh
        subsequence(str, indx + 1, newStr, set);
    }

    public static void main() {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        subsequence(str, 0, "", set);
    }
}
