package Arrays;

// import java.util.*;
public class LargestNumber {

    public static int largestOfArr(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 23, 32, 4, 500 };
        System.out.println(largestOfArr(arr));
    }
}
