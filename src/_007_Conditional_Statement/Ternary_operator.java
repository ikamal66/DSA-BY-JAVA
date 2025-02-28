package _007_Conditional_Statement;
import java.util.Scanner;
// Find Even and Odd numbers using the Ternary Operator
public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        String check = (number%2==0)?"Even":"Odd";
        System.out.println(check);
    }
}
