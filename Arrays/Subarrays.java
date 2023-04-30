package Arrays;

public class Subarrays {

    public static void getSubArray(int arr[]) {
        int counter = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            counter++;
            for (int j = i + 1; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                counter++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays are = " + counter);
    }

    public static void getSubArrayWithMinMaxSum(int arr[]) {

        int counter = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("| sum = " + sum);
                if (sum < minSum) {
                    minSum = sum;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                counter++;
                System.out.println();
            }
        }
        System.out.println("Minimum sum: " + minSum + " and Maximum sum: " + maxSum);
        System.out.println("Total subarrays are = " + counter);

    }

    // Using Prefix array to find Max sum of sub array which is optimized than above
    // approach
    public static void maxSubArraySumUsingPrefix(int arr[]) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(maxSum);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i] < 0 ? 0 : currSum + arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("The maximum sub array sum: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // getSubArray(arr);
        // getSubArrayWithMinMaxSum(arr);
        // maxSubArraySumUsingPrefix(arr);
        kadanes(arr);
    }
}
