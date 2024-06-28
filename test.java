import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the book name: ");
    String book = sc.next();

    String availableBooks[]=new String[4];
    for(int i = 0; i<availableBooks.length;i++){
        if(availableBooks[i]==null){
            availableBooks[i]=book;
            break;
        }
    }
    for (String elem : availableBooks) {
        System.out.println(elem);
        
    }
        
    }
}