import java.util.*;

public class FloydsRightAlignedTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        sc.close();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(counter++ + " ");
                }
            }
            System.out.println();
        }
    }
}
