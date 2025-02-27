package _007_Conditional_Statement;
import java.util.Scanner;
// Calculator

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':  System.out.println(num1+num2);
            break;
            case '-':  System.out.println(num1-num2);
            break;
            case '*':  System.out.println(num1*num2);
            break;
            case '/':  if(num2!=0) System.out.println(num1/num2);
            else System.out.println("Error! Division by zero is not allowed.");
            break;
            case '%': System.out.println(num1%num2);
            break;
            default: System.out.println("Error! Invalid operator. Please enter a valid operator (+, -, *, /).");
        }
    }
}
