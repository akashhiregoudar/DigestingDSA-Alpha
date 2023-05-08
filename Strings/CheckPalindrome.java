package Strings;

public class CheckPalindrome {

    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean res = isPalindrome(str);
        if (res) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
