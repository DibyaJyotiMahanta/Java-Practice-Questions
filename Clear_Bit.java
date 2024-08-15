public class Clear_Bit {
    public static void main(String[] args) {
     int n = 5;
     int pos = 2;
     int mask = 1<<pos;
     System.out.println((~mask)&n);   
    }
}
