package _009_Loops;
// Find the Square root of any number
import java.util.Scanner;

public class _16FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is: " + squareRoot);
    }
}
/*
Output:
Enter number:
10
Square root of 10 is: 3.1622776601683795
 */
