import java.util.Scanner;

class InvalidInput extends Exception {
    public InvalidInput(String str) {
        super(str);
    }
}

class NoDivide0 extends Exception{
    public NoDivide0(String str) {
        super(str);
    }
}

class MaxInput extends Exception{
    public MaxInput(String str) {
        super(str);
    }
}
class MaxMultiplyInput extends Exception{
    public MaxMultiplyInput(String str) {
        super(str);
    }
}

class Maths{
    int add(int a, int b){

        try{
            if(a>=100000||b>100000){
                throw new MaxInput("the limit of Input is Reached");
            }
            return a+b;
            
        }
        catch(MaxInput max){
            System.out.println(max);
        }
        return 0;
    }


    int subtract(int a, int b){

        try{
            if(a>=100000||b>100000){
                throw new MaxInput("the limit of Input is Reached");
            }
            return a-b;
            
        }
        catch(MaxInput max){
            System.out.println(max);
        }
        return 0;
    }


    int multiply(int a, int b){

        try{
            if(a>=100000||b>100000){
                throw new MaxInput("the limit of Input is Reached");
            }
            if(a>=7000||b>7000){
                throw new MaxMultiplyInput("the limit of Multily Input is Reached");
            }
            
            return a*b;
            
        }
        catch(MaxInput | MaxMultiplyInput max){
            System.out.println(max);
        }
        return 0;
    }


    int divide(int a, int b){

        try{
            if(a>=100000||b>100000){
                throw new MaxInput("the limit of Input is Reached");
            }
            if(b==0){
                throw new NoDivide0("Cannot divide the number by 0");
            }
            
            return a/b;
            
        }
        catch(MaxInput max){
            System.out.println(max);
        }
        catch(NoDivide0 nd){
            System.out.println(nd);
        }
        return 0;
    }    
}


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the first number: ");
        int b = sc.nextInt();

        System.out.println("Choose a calculation option: ");
        System.out.println("1 > Addition");
        System.out.println("2 > Subtraction");
        System.out.println("3 > Multiplication");
        System.out.println("4 > Division");

        System.out.print("Enter your option? ");
        int option = sc.nextInt();

        Maths m = new Maths();

        switch (option) {
            case 1 ->{
                System.out.println(m.add(a, b));
            }  
            case 2 ->{
                System.out.println(m.subtract(a, b));
            } 
            case 3 ->{
                System.out.println(m.multiply(a, b));
            }  
            case 4 ->{
                System.out.println(m.divide(a, b));
            }              
            default ->{
                System.out.println("Enter a valid input");;
            }
        }

    
    }
}
