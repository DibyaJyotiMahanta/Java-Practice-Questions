class Monkey{
    void jump(){
        System.out.println("i can jump");
    }
    void bite(){
        System.out.println("i can bite");
    }
}
interface BasicHumanInteractions{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicHumanInteractions{
    @Override
    public void eat(){
        System.out.println("i can eat");
    }

    @Override
    public void sleep(){
        System.out.println("i can sleep");
    }
}

public class MonkeyEvolution {
    public static void main(String[] args) {
        Monkey h = new Human();
        h.jump();
        h.bite();
    }
}
