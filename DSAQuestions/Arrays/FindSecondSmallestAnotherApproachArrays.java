package RemoteRepoNexux.DSAQuestions.Arrays;
import java.util.Arrays;
public class FindSecondSmallestAnotherApproachArrays {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Second Smallest elements is : "+findSecondSmallest(arr));
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        return arr[1];
    }
}
