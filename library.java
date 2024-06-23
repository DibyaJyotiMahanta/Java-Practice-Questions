import java.util.Scanner;

class Lib{
    String [] availableBooks;
    String [] issuedBooks;
    void size(int n){
        availableBooks=new String[n];
        issuedBooks=new String[n];
    }
}

class bookAdding extends Lib{
   void addBook(){
    Scanner sc = new Scanner(System.in);
    System.out.println(" ");
    System.out.print("Enter the book name: ");
    String book = sc.next();
    System.out.println(" ");
    for(int i = 0; i<availableBooks.length;i++){
        if(availableBooks[i]==null){
            availableBooks[i]=book;
            break;
        }
    }
   }
}

class BookIssuing extends bookAdding{
    void issuebook(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the book name: ");
        String book = sc.next();
        System.out.println(" ");
        for(int i = 0; i<issuedBooks.length;i++){
            if(issuedBooks[i]==null){
                issuedBooks[i]=book;
                break;
            }
        }
        for(int i = 0; i<availableBooks.length;i++){
            if(availableBooks[i].equals(book)){
                availableBooks[i]=null;
                break;
            }
        }
    }
}

class BookReturning extends BookIssuing{
    void bookReturn(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the book name: ");
        String book = sc.next();
        System.out.println(" ");
        for(int i = 0; i<issuedBooks.length;i++){
            if(issuedBooks[i].equals(book)){
                issuedBooks[i]=null;
                break;
            }
        }
        for(int i = 0; i<availableBooks.length;i++){
            if(availableBooks[i]==null){
                availableBooks[i]=book;
                break;
            }
        }
    }
}

class ShowBooks extends BookReturning{
    String [] showAvailableBooks(){
        return availableBooks;
    }
    String [] showIssuedBooks(){
        return issuedBooks;
    }
}

public class  library{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the number of Issued Books and Available Books");
        int size = sc.nextInt();
        System.out.println(" ");
        boolean b = false;
        ShowBooks obj = new ShowBooks();

        obj.size(size);

        while(b!=true){
            System.out.println(" ");
            System.out.print("Hello welcome to the Library which will never be used!!! \n Choose options:- \n  1) Add a book \n 2) Issue a book \n 3) Return a book \n  4) Show Available Books \n 5) Show Issued Books \n 6) Exit \n Now please let me know your choice: ");
           int choice = sc.nextInt();
           System.out.println(" ");
            switch (choice) {
                case 1->{
                    obj.addBook();
                    System.out.println("Book has been added");
                    break;
                }
                case 2->{
                    obj.issuebook();
                    System.out.println("Book have been issued sucessfully");
                    break;
                }
                case 3->{
                    obj.bookReturn();
                    System.out.println("Book has been returned");
                    break;
                }
                case 4->{
                    String available[] = obj.showAvailableBooks();
                    for(int i = 0; i<available.length;i++){
                        System.out.print(available[i]+", ");
                    }
                    break;
                }
                case 5->{
                    String issued[] = obj.showIssuedBooks();
                    for(int i = 0; i<issued.length;i++){
                        System.out.print(issued[i]+", ");
                    }
                    break;
                }
                case 6->{
                    System.out.println("Lirary EXIT -->");
                    b  = true;
                    break;
                }
                default->{
                    System.out.print("Enter a valid choice");
                    break;
                }
                    
                
            }
        }
        
    }
}