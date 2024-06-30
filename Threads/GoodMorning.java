class MorningThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<2000){
        System.err.println("Good Morning");
        i++;
    }
}
}

class WelcomeThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<2000){
        System.out.println("Welcome");
        i++;
        }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
}
}

public class GoodMorning {
    public static void main(String[] args) {
        MorningThread t1 = new MorningThread();
        WelcomeThread t2 = new WelcomeThread();
        t1.start();
        t2.start();
    }
}
