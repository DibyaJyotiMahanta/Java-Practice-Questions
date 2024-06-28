

class Input{
    void name(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your name? ");
        System.out.println(sc.nextLine());

    }
}

public class UserInput {
    public static void main(String[] args) {
        Input i =new Input();
        i.name();
    }
}
