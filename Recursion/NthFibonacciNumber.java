package Recursion;

public class NthFibonacciNumber {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return (fibonacci(n - 2) + fibonacci(n - 1));
    }

    public static void main(String[] args) {
        int ans = fibonacci(7);
        System.out.println(ans);
    }
}
