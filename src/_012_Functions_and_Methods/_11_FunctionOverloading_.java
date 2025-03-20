package _012_Functions_and_Methods;
// Function Overloading
import java.util.Scanner;

public class _11_FunctionOverloading_ {
// sum of 2 numbs
    public static int sum(int a, int b){
    return a+b;
}
// sum of 3 numbs
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3");
        int num3 = sc.nextInt();
        System.out.println("The sum of first 2 values are: "+sum(num1,num2));
        System.out.println("The sum of all values are: "+sum(num1,num2,num3));
    }
}
/*
Output:
Enter the num1
5
Enter the num2
6
Enter the num3
7
The sum of first 2 values are: 11
The sum of all values are: 18
 */