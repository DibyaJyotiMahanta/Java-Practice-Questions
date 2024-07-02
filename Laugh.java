public class Laugh {

    public static void main(String[] args) {
        int a=0;

        try {
            System.out.println(a / 2);
            if(a==0){
                throw new IllegalArgumentException();
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
