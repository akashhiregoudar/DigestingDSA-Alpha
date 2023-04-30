package Arrays;

public class SortingAlgo {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Display.display(arr);
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minPos = i;
            for (int j = i; j < n; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        Display.display(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        Display.display(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 1, 5, 23, 3, 65, 23, 12 };
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
    }
}
