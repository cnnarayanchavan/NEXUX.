package DSAQuestions.Arrays;

public class FindSecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,1};
        //function for finding second-smallest element from an array
        System.out.println("The second smallest element is : "+ findSecondSmallest(arr));
    }

    private static String findSecondSmallest (int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
        }
        return String.valueOf(secondSmallest);
    }
}
