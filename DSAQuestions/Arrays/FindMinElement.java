package RemoteRepoNexux.DSAQuestions.Arrays;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {45,35,6,3,2,5,7};
        System.out.println("Min Element from an array is : "+findMin(arr));

    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
