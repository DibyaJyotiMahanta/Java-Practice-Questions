public class GetBit {
    public static void main(String[] args){
        int n = 5;
        int pos = 2 ;
        int mask = 1<<pos;
        // System.out.print(mask);
        if((mask & n) == 0){
            System.out.println("Bit at 3rd pos 0");
        }
        else{
            System.out.println("Bit in 3rd pos is 1");
        }
    }
}

