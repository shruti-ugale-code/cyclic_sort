import java.util.Arrays;

public class Find_missing_ele {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4,1, 0, 6};
        sort(arr);


        System.out.println(sort(arr));

    }

    public static int sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int element = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[element]) {
                int temp = arr[i];
                arr[i] = arr[element];
                arr[element] = temp;
            } else {
                i++;
            }
        }
            for (int index = 0; index < arr.length; index++) {


           if(arr[index] != index) {
               return index;

           }

            }


        return arr.length;


    }
}
