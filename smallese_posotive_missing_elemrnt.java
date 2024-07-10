import java.util.Arrays;

public class smallese_posotive_missing_elemrnt {

        public static void main(String[] args) {
            int[] arr = {3,5,6,0,2,1};
            Sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(Sort(arr));
        }
        public static int Sort(int[] nums){
            int i = 0;
            while(i <= nums.length-1){
                int correct = nums[i]-1;
                if ( nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1){
                    return index+1;
                }
            }
            return nums.length+1;
        }
        static void swap(int[] arr, int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

