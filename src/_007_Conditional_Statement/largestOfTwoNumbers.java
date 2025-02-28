package _007_Conditional_Statement;
import java.util.Scanner;
// Find the largest number b/w the two values
public class largestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1 value");
        int num1 = sc.nextInt();
        System.out.println("Enter the num 2 value");
        int num2 = sc.nextInt();
        if(num1>=num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
