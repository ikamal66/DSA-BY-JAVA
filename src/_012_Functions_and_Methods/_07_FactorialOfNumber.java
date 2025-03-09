package _012_Functions_and_Methods;
import java.util.Scanner;

// Find the factorial of the number using of the functions
public class _07_FactorialOfNumber {
//    public static int factorial(int number){
//        if(number==0 || number==1) {
//            return 1;
//        }
//        else {
//            return number * factorial(number - 1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to find its factorial:");
//        int number = sc.nextInt();
//        int factorialResult = factorial(number);
//        System.out.println(factorialResult);
//    }

/*
Output:
Enter a number to find its factorial:
5
120
 */

    // OTHER METHOD:

    public static int factorial(int number){
        int num =1;
        for(int i=1; i<=number; i++){
            num = num*i;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
}
/*
Output:
Enter a number to find its factorial:
6
720
 */