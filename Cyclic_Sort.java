import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,4,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr){
        int i = 0;
        while(i <= arr.length-1){
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}