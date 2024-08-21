public class PhoneSubSequence {
    static String[] s = {".", "abc", "def","ghi", "jkl", "mno","pqrs","tu", "vwx", "yz"};
    static void subsequence(String str,  int indx, String Sequence){
        if(indx==str.length()){
            System.out.println(Sequence);
            return;
        }   
        char c = str.charAt(indx);
        String mapping = s[c-'0'];

        for(int i =0; i<mapping.length();i++){
            subsequence(str, indx+1, Sequence+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        subsequence(str, 0, "");


    }
}
