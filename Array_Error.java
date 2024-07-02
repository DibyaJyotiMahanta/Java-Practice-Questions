
class Max_Error extends Exception {

    public Max_Error(String str) {
        super(str);
    }
}

public class Array_Error {

    public static void main(String[] args) throws Max_Error {
        try {
            int arr[] = {1, 2, 3, 4, 5};
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
                if (i == 4){
                    throw new Max_Error("Max retires reached!");
                    }
            }
            
        } catch (Max_Error e) {
            System.out.println(e);
        }
    }
}
