import java.util.Scanner;

class Flowchart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        if (num[0] > num[1]) {
            if (num[0] > num[2]) {
                System.out.println(num[0] + " is largest number among " + num[0] + " " + num[1] + " " + num[2]);
            } else {
                System.out.println(num[2] + " is largest number among " + num[0] + " " + num[1] + " " + num[2]);
            }
        } else {
            if (num[1] > num[2]) {
                System.out.println(num[1] + " is largest number among " + num[0] + " " + num[1] + " " + num[2]);
            } else {
                System.out.println(num[2] + " is largest number among " + num[0] + " " + num[1] + " " + num[2]);
            }
        }
    }
}