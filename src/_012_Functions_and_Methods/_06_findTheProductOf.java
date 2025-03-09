package _012_Functions_and_Methods;
import java.util.Scanner;

// Find the product of a and b
public class _06_findTheProductOf {
    public static int productOfNumbers(int a, int b){
//        return a * b;  // it is direct method
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int product = productOfNumbers(num1, num2);
        System.out.println("The product of these numbers is: " +product);
        product = productOfNumbers(10,2);
        System.out.println("The product of 10 and 2 is: " +product);
    }
}
