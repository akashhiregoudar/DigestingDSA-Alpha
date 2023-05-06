package Arrays;

import java.util.*;

public class TwoDSpiralMatrix {

    public static void printSpiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Print top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // Print right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Print bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }

            // print left
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printSpiralMatrix(arr);
    }
}
