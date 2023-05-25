package Recursion;

public class FirstOccOfKeyInArr {

    public static int firstOcc(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int key = 6;
        int ans = firstOcc(arr, 0, key);
        System.out.println(ans);
    }
}
