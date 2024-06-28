interface TvRemote{
    void IR();
    void membraneKeyboard();
}

interface smartRemote extends  TvRemote{
    void display();
    void voiceActivate();
}

class remote implements smartRemote{
    @Override
    public void IR(){
        System.out.println("I can control");
    }

    @Override
    public void membraneKeyboard(){
        System.out.println("Press buttons");
    }

    @Override
    public void display(){
        System.out.println("You can see the fucntions");
    }

    @Override
    public void voiceActivate(){
        System.out.println("You can speak and i can listen!");
    }
}

class tvv implements TvRemote{

    @Override
    public void IR(){
        System.out.println("I am tv remote IR");
    }

    @Override
    public void membraneKeyboard(){
        System.out.println("I am tv's remote keyboard");
    }
}

public class Tv {
    public static void main(String[] args) {
        remote r = new remote();
        r.IR();
        r.membraneKeyboard();
        r.display();
        r.voiceActivate();

        tvv t = new tvv();
        t.IR();
        t.membraneKeyboard();
    }
}
