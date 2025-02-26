package _003_Variable_and_DataType;
import java.util.Scanner;
// Product of two numbers
public class product_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();
        int mul = num1 * num2;
        System.out.println("The product is: "+mul);
    }
}
/*
Output:
    Enter the number 1:
    12
    Enter the number 2:
    12
    The product is: 144
 */
