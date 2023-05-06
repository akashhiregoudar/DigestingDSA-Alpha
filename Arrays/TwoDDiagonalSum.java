package Arrays;

import java.util.*;

public class TwoDDiagonalSum {

    public static void calcDiagonalSum(int arr[][]) {
        int leftRightD = 0;
        int rightLeftD = 0;
        for (int i = 0; i < arr.length; i++) {
            leftRightD += arr[i][i];
            if (i != arr.length - i - 1)
                rightLeftD += arr[i][arr.length - i - 1];
        }
        System.out.println("Diagonal sum is : " + (rightLeftD + leftRightD));
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

        calcDiagonalSum(arr);
        sc.close();
    }
}
