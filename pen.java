abstract class penn{
    abstract void write();
    abstract void refill();
}

class real_pen extends penn{

    @Override
    void write() {
        System.out.println("hey i am writting.");
    }
    @Override
    void refill(){
        System.out.println("hey i am refillinng");
    }
}
class fountain_pen extends penn{

    @Override
    void write(){
        System.out.println("i am fountain pen write");
    }
    @Override
    void refill(){
        System.out.println("i am fountain pen refill");
    }
    void old(){
        System.out.println("i am old");
    }

}


public class pen {
    public static void main(String[] args) {
        real_pen r = new real_pen();
        r.write();
        fountain_pen f = new fountain_pen();
        f.old();
    }
}
