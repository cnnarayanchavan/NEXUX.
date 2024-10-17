package RemoteRepoNexux.DSAQuestions.Arrays;

public class MamSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,-1,-2,3,4,6};
        System.out.println("Max sum subarray is : "+findMaxSumSubArray(arr));
    }
    public static int findMaxSumSubArray(int[] arr) {
        int maxExistingSum = arr[0];
        int sumSoFar = arr[0];
        for(int i = 0; i< arr.length; i++) {
            maxExistingSum = Math.max(arr[i],maxExistingSum+arr[i]);
            sumSoFar = Math.max(sumSoFar,maxExistingSum);
        }
        return sumSoFar;
    }
}
