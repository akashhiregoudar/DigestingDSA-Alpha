package Recursion;

public class CalcXpowN {

    public static int findxpn(int x, int n) {
        if (n == 1) {
            return x;
        }
        if ((n & 1) == 0) {
            return findxpn(x, n / 2) * findxpn(x, n / 2);
        }
        return (2 * findxpn(x, n / 2) * findxpn(x, n / 2));
    }

    // More optimized than obove function as it calls recursivilly more times

    public static int moreOptimizedFindxpn(int x, int n) {
        if (n == 1) {
            return x;
        }
        int halfPower = findxpn(x, n / 2);
        if ((n & 1) == 0) {
            return halfPower * halfPower;
        }
        return 2 * halfPower * halfPower;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(findxpn(x, n));
    }
}
