package Arrays;

public class ReverseArray {

    public static void reverseArr(int arr[]) {
        int i = 0;
        int n = arr.length;
        int temp = 0;
        while (i < n - i - 1) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        // Display d = new Display();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Display.display(arr);
        reverseArr(arr);
        Display.display(arr);
    }
}
