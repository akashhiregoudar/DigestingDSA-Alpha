import java.util.Scanner;

public class GstBillCalc {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Pencil, Pen and Eraser");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();
        float total = pencil + pen + eraser;
        float gst = (total * 18) / 100;
        System.out.println("The total price including gst(" + gst + ") is " + (total + gst));
    }
}
