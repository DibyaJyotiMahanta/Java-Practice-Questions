public class Removing_Duplicate {

static void removeDuplicate(String str, String s, int len){
    if(len == 0){
        char c = str.charAt(len);
        String s1 = String.valueOf(c);
            s=s1+s;
        System.out.println(s);
        return;
    }

    char c = str.charAt(len);
    String s1 = String.valueOf(c);

    if(c!=str.charAt(len-1)){
        s=s.concat(s1);
    
}
    removeDuplicate(str, s, len-1);
    System.out.println(s);
}

    public static void main(String[] args) {
        String s = "hello";
        removeDuplicate(s, "", 4);
    }
}
