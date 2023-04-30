package Arrays;

public class BinarySearch {

    public static int binSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 1;
        int res = binSearch(arr, key);
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " is found at " + res);
        }
    }
}
