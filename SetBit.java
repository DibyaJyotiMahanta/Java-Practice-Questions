public class SetBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int mask = 1<<pos;
        System.out.println((mask|n));
    }
}
