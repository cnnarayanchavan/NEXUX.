package DSAQuestions.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,3,5,3,6,3,7};
        System.out.println("Second Largest is: "+findSecondLargest(arr));

    }
    public static int findSecondLargest(int[] arr) {
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
        }
        return secondLargest;
    }
}
