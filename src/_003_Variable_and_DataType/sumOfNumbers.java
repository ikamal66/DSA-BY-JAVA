package _003_Variable_and_DataType;
import java.util.Scanner;
// Sum of two numbers by taking input from the user
public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of numbers is: "+sum);
    }
}
/*
Output:
    Enter the number 1:
    12
    Enter the number 2:
    12
    The sum of numbers is: 24
 */