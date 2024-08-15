public class Update_Bit {
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int mask = 1<<pos;
        int i =2;
        switch(i){
            case 1:{
                System.out.println("changing to 1");
                System.out.println(mask|n);
                break;
            }
            case 2:{
                System.out.println("changing to 0");
                System.out.println(~mask&n);
                break;
            }
            default:{
                System.out.println("Om namah Shivaya");
                break;
            }

        }

    }
}
