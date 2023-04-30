import java.util.*;

public class OneZeroTraingle {

    public static void herApproach(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        sc.close();
        herApproach(n);
        int x;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                x = 0;
            } else {
                x = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x = x == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
