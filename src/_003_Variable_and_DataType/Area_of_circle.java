package _003_Variable_and_DataType;
// Calculate the Area of Circle
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        // Area of the circle = pi*radius*radius
        double area = Math.PI*radius*radius;
        System.out.println("Area of the circle is: " + area);
    }
}
/*
Output:
Enter the radius of the circle
4
Area of the circle is: 50.26548245743669
 */
