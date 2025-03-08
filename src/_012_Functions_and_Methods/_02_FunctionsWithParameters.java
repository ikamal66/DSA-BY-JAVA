package _012_Functions_and_Methods;
// Functions with parameters
import java.util.Scanner;
// Here (int a, int b) is the parameters which is input:
// Arguments are actual
public class _02_FunctionsWithParameters {
    public static int sumNumbers(int a, int b){ // parameters or formal parameters
        int sum = a+b;
        return sum;
//        return a+b; // Direct method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int sum = sumNumbers(num1, num2); // arguments or actual arguments
        System.out.println("The sum is "+sum);
    }
}
/*
Output:
Enter num1
12
Enter num2
12
The sum is 24
 */