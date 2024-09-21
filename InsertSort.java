public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {14, 9, 15, 12, 6, 8, 13};
        

        for(int i = 0; i<arr.length; i++){
            int len = i;
           while(len!=0 && len>=0){
            if(arr[len]<arr[len-1] && len>0){
                int temp = arr[len];
                arr[len]=arr[len-1];
                arr[len-1]=temp;
                }
                len--;
           }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}