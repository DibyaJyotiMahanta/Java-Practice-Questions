public class Selectionsort{
    public static void main(String[] args) {
        int[] array={9,3,5,2,9,8};
        int smallest=array[0];
        int indexofsmall = 0;
        for(int i = 0; i<array.length-1;i++){
            for(int j = i+1; j<array.length;j++){
                if(smallest>array[j]){
                    smallest = array[j];
                    indexofsmall=j;
                }
            }
            int temp = array[i];
            array[i]=smallest;
            array[indexofsmall]=temp;
        }

        for(int i :array){
            System.out.print(i);
        }
    }
}