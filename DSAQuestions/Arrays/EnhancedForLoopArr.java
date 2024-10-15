package RemoteRepoNexux.DSAQuestions.Arrays;

public class EnhancedForLoopArr {
    public static void main(String[] args) {
        int[] arr = {34,23,43,23,23};
        enhancedFor(arr);
    }

    public static void enhancedFor(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
