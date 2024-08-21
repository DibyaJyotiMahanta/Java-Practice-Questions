public class Subsequence {
    static void subsequence(String str, int indx, String newStr){
        
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }
        char c = str.charAt(indx);
        //aagr aana chahta hai
        subsequence(str, indx+1, newStr+c);

        //agr ni ana chahta
        subsequence(str, indx+1, newStr);
    }
    public static void main(String args[]){
        String str="abc";
        subsequence(str, 0, "");
    }
}
