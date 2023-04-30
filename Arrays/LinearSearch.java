package Arrays;

import java.util.*;

public class LinearSearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key val to be searched");
        int key = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at " + i + " index");
                break;
            } else {
                if (i == n - 1) {
                    System.out.println(key + " is not present in the array");
                }
            }
        }

    }
}
