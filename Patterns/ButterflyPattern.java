import java.util.*;;

public class ButterflyPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if (j <= i || j > n * 2 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n * 2; j++) {
                if (j <= i || j > n * 2 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
