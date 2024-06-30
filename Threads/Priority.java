class Task1 extends Thread{
    @Override
    public void run(){
       int i = 0;
        while(i<100){
        System.out.println("I am Thread 1");
        i++;
    }
}
}

class Task2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
        System.out.println("I am Thread 2");
        i++;
    }
}
}

public class Priority {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.setPriority(Thread.MAX_PRIORITY);

        //set priority range(1,10)
        t1.setPriority(1);
        
        t1.start();
        // t2.start();

        System.out.println("my priority is "+t1.getPriority());
        System.out.println("my State is "+t1.getState());
    }
}
