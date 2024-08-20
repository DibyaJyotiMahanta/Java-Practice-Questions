

public class Array_sorted_check {

static void check(int[] arr, int count){
    if(count == arr.length-1){
        return;
    }
    if(arr[count]<arr[count+1]&&arr[count]!=arr[count+1]){
        System.out.println("array is sorted till for index "+count);
    check(arr, count+1);
}
else{
    System.out.println("Array is not sorted from index "+count);
}
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        check(arr, 0);
    }
}
