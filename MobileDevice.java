abstract class Telephone{
    abstract void ring();
    abstract void disconnect();
    abstract void lift();
}

class Phone extends Telephone{
    void ring(){
        System.out.println("Tring Tring Trung Trung!!!");
    }
    void disconnect(){
        System.out.println("Tun Tun Tun");
    }

    void lift(){
        System.out.println("Hello Moshi Moshi!!");
    }
}

public class MobileDevice {
    public static void main(String[] args) {
        Telephone t = new Phone();
        t.ring();
        t.disconnect();
        t.lift();
    }
}
