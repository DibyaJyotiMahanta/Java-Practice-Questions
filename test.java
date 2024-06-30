class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20000){
            System.out.println("I Love Jeevitha");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20000){
            System.out.println("I Love Sharmila");
            i++;
        }
    }
}
public class test{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}