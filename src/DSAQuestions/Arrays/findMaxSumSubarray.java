package DSAQuestions.Arrays;

public class findMaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        System.out.println("the max sum subarray is : "+findMaxSumSub(arr));
    }
    public static int findMaxSumSub (int[] arr) {
        //now make sure the current and previous element of an array to calculate the sum
        //init 2 variables to track the max sum
        int maxExistingElement = arr[0];
        int sumSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxExistingElement = Math.max(arr[i], maxExistingElement + arr[i] );

            sumSoFar = Math.max(sumSoFar, maxExistingElement);
        }
        return sumSoFar;
    }
}
