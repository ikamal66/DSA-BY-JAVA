package _012_Functions_and_Methods;
// Optimized Way to check number is prime or not
import java.util.Scanner;

public class _14_PrimeOrNot_Optimized {
    public static boolean isPrime(int number) {
        if(number<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
/*
Output:
Enter a number
12
false
 */