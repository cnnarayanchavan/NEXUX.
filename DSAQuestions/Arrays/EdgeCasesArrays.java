package RemoteRepoNexux.DSAQuestions.Arrays;

public class EdgeCasesArrays {
    public static void main(String[] args) {
        int[] arr = {1};
        ifEmpty(arr);
    }

//    Empty array: Make sure to check if the array has elements (arr.length > 0).
    public static void ifEmpty(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("Empty array please insert elements.");
        }else{
            System.out.println("array has "+ arr.length +" elements.");
        }
    }
}
