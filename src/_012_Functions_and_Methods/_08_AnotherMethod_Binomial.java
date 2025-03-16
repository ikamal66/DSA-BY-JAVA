package _012_Functions_and_Methods;
import java.util.Scanner;
// It is professionally way for find Binomial Coefficient
public class _08_AnotherMethod_Binomial {
    public static int factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }

    public static int binCoeff(int n, int r){
         int nFact = factorial(n);
         int rFact = factorial(r);
         int nmrFact = factorial(n-r);
         return nFact/(rFact*nmrFact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        System.out.println("Enter the r value:");
        int r = sc.nextInt();
        System.out.println("The Binomial Coefficient is: "+binCoeff(n,r));
    }
}
/*
Output:
Enter the n value:
6
Enter the r value:
4
The Binomial Coefficient is: 15
 */
