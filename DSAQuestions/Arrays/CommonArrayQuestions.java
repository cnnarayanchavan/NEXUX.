package RemoteRepoNexux.DSAQuestions.Arrays;
import javax.management.DescriptorKey;
import java.util.Arrays;
public class CommonArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {23,45,34,56,78,21};

        // 1]
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        // 2]
        searchElement(arr,56);

        //3]
        searchUsingBinarySearch(arr,56);
    }


    //Fun for sorting array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }


    //Fun for searching ele in array
    public static void searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index : "+i);
            }
        }
    }

    //Fun for searching using Binary search
    public static void searchUsingBinarySearch(int[] arr, int element) {
        Arrays.sort(arr);
        Arrays.binarySearch(arr, element); //it will not work directly

    }
}
