package BitManipulation;

public class ModularExponential {
    public static void main(String[] args) {
        long x = 282538755;
        long n = 244836246;
        long m = 757161423;
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * x) % m;
            }
            x = (x * x) % m;
            n = n >> 1;
        }
        System.out.println(ans % m);
    }
}
