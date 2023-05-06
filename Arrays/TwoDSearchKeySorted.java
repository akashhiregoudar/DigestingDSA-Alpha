package Arrays;

import java.util.*;;

public class TwoDSearchKeySorted {

    public static void findKey(int arr[][], int key) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (key == arr[i][j]) {
                System.out.println("kwy found at: " + i + "," + j);
                return;
            } else if (key > arr[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Key not found");
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
        System.out.println("Enter key value");
        int key = sc.nextInt();

        findKey(arr, key);
        sc.close();
    }

}
