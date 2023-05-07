package Arrays;

public class ArrayPractise {

    public static void findDuplicateElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicates found at index: " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Not found any duplicate");
    }

    public static void findMin(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid - 1] > arr[mid]) {
                System.out.println("Found point at: " + mid);
                return;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 8, 1, 2, };
        // findDuplicateElements(arr);
        findMin(arr);
    }
}
