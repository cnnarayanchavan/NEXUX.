package DSAQuestions.Arrays;


public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Max ele from arr is: "+findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
