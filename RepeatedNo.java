import java.util.Arrays;

public class RepeatedNo {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Sort(arr));
    }
    public static int Sort(int[] nums){
        int i = 0;
        while(i <= nums.length-1) {
            if (nums[i] != i + 1) {
                int correct = nums[i]-1;
                if ( nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }


        return -1;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}