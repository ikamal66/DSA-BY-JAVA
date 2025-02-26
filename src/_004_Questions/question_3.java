package _004_Questions;
import java.util.Scanner;

/*
 Enter the cost of 3 items from the user (using float data type) - a pencil, a pen, and an eraser.
  You have to output the total cost of the items back to the user as their bill.
  (Add on: You can also try adding 18% GST tax to the items in the bill as an advanced problem)
*/
public class question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        float gst = bill*0.18f;
        float total_bill = bill+gst;
        System.out.println("Total cost of the items without GST is: " +bill);
        System.out.println("Total cost of the items with GST is: " +total_bill);
    }
}
/*
output:
    Enter the cost of pencil
    5
    Enter the cost of pen
    10
    Enter the cost of eraser
    5
    Total cost of the items without GST is: 20.0
    Total cost of the items with GST is: 23.6
 */