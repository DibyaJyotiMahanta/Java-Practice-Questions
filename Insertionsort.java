
public class Insertionsort {

    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 7, 1, 5};
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j =i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i : arr){
            System.out.print(i);
        }
    }
}
