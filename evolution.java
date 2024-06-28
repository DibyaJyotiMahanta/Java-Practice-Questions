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

public class evolution {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
