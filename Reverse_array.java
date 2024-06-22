
public class Reverse_array {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 7, 10};
        int temp = 0;

        int k = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            k--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
