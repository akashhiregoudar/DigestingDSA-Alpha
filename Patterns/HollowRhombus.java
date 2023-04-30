import java.util.*;

public class HollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - i; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    if (j == n - i + 1 || j == n * 2 - i || i == 1 || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
