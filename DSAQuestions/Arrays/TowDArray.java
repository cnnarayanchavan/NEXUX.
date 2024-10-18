package RemoteRepoNexux.DSAQuestions.Arrays;

import java.util.Scanner;

public class TowDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetElement = sc.nextInt();
        towDArray(targetElement);

    }

    //FUN FOR DEFINING AND PRINTING 2D ARRAY.
    public static void towDArray ( int targetElement ) {
        //for 2D array we need a matrix in which we have rows and cols so let's check it out.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Columns : ");
        int cols = sc.nextInt();
        int[][] arr = new int[row][cols];

        //for adding element into 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }




        //for printing elements from 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                //search for an element in 2D array.
                if (arr[i][j] == targetElement) {
                    System.out.println("Element found at index :["+i+"]["+j+"]");
                }
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
