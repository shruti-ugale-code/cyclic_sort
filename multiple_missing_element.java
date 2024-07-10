import java.util.ArrayList;
import java.util.List;



    public class multiple_missing_element {

        public static List<Integer> main(String[] args) {
            int arr[] = {3, 5, 4, 1, 2, 6};
            sort(arr);
            System.out.println();

            return null;
        }

        public static List<Integer> sort(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int element = arr[i] - 1;
                if (arr[i] != arr[element]) {
                    int temp = arr[i];
                    arr[i] = arr[element];
                    arr[element] = temp;
                } else {
                    i++;
                }


            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {


                if (arr[index] != index+1) {
                    ans.add(index+1);

                }
            }


            return ans; }

    }


