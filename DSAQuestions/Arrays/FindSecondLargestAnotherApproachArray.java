package RemoteRepoNexux.DSAQuestions.Arrays;

import java.util.Arrays;

public class FindSecondLargestAnotherApproachArray {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,6};
        System.out.println("The second largest element form an array is : "+findSecondLargest(arr));
    }

    public static int findSecondLargest (int[] arr) {
        //edge case will be
        if (arr.length < 2) return -1;  //empty array
        Arrays.sort(arr);
        return arr[arr.length-2];

    }
}
