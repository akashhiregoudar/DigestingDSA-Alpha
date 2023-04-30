package Arrays;

import java.util.*;

public class MaxAndMin2DArray {

    public static boolean findKey(int arr[][], int key, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void findMinMax(int arr[][], int n, int m) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(arr[i][j], max);
                min = Math.min(arr[i][j], min);
            }
        }
        System.out.println("Max value : " + max);
        System.out.println("Min value : " + min);
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
        System.out.println("Enter 1-> To find key in Matrix");
        System.out.println("Enter 2-> To find min and max value in Matrix");
        int val = sc.nextInt();
        switch (val) {
            case 1:
                System.out.println("Enter key value");
                int key = sc.nextInt();
                boolean found = findKey(arr, key, n, m);
                if (found) {
                    System.out.println("Found key");
                } else {
                    System.out.println("Not found");
                }
                break;
            case 2:
                findMinMax(arr, n, m);
                break;
            default:
                System.out.println("Choise allowed are 1 and 2.");
        }
    }
}
