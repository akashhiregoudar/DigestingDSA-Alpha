package Basic;

import java.util.*;

public class BasicCode {

    public static double factorial(double f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        return res;
    }

    public static double bCoEfficient(double n, double r) {
        double factN = factorial(n);
        double factR = factorial(r);
        double factNR = factorial((n - r));
        return (factN / (factR * factNR));
    }

    public static int binoToDec(int biNum) {
        int power = 0;
        int dec = 0;
        int ld;
        while (biNum > 0) {
            ld = biNum % 10;
            biNum = biNum / 10;
            dec = (int) (dec + (ld * Math.pow(2, power)));
            power++;
        }
        return dec;
    }

    public static int decToBin(int decNum) {
        int power = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, power));
            power++;
            decNum = decNum / 2;
        }
        return binNum;
    }

    public static boolean isPalindrome(int num) {
        int firstNum = num;
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        if (reverseNum == firstNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));
    }
}