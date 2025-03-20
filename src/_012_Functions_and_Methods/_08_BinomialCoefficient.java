package _012_Functions_and_Methods;
// Binomial Coefficient
// Try By myself Binomial
/*
Formula of Binomial Coefficient:
C(n, r) = n! / (r!(n-r)!)
 */
import java.util.Scanner;

public class _08_BinomialCoefficient {
    public static int factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        else{
            return number * factorial(number-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        System.out.println("The factorial of n is: "+factorial(n));
        System.out.println("Enter the r value:");
        int r = sc.nextInt();
        System.out.println("The factorial of r is: "+factorial(r));
        int n_r = n-r;
        System.out.println("The factorial of n-r is: "+factorial(n_r));

        System.out.println("The Binomial coefficient is:");
        System.out.println(factorial(n)/(factorial(r)*factorial(n_r)));
    }
}
/*
Output:
Enter the n value:
5
The factorial of n is: 120
Enter the r value:
2
The factorial of r is: 2
The factorial of n-r is: 6
The Binomial coefficient is:
10
 */