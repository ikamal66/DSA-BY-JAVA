package _012_Functions_and_Methods;
// Check number is prime or not
import java.util.Scanner;

public class _13_PrimeOrNot {
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
/*
Output:
Enter number:
121
false
 */