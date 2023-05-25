package Recursion;

public class SumOfFirstNumber {

    public static int sumOfNaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNo(n - 1);
    }

    public static void main(String[] args) {
        int ans = sumOfNaturalNo(10);
        System.out.println(ans);
    }
}
