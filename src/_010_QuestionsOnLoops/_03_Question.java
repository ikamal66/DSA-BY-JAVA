package _010_QuestionsOnLoops;
/*
Write a program to find the factorial of any number entered by the user.
 */
import java.util.Scanner;

// factorial(n) = (n)*(n-1)*(n-2)...1
// factorial(5) = 5*4*3*2*1  = 120
// factorial(0) = 1
// factorial(n) = n* factorial(n-1)  // formula
public class _03_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        if(num==0 || num==1){
            System.out.println(1);
        }
       else{
            int value = 1;
            for(int i=num; i>=1; i--){
                value = value*i;
            }
            System.out.println("The Factorial of "+num+" is "+value);
        }
    }
}
/*
Output:
Enter number:
5
The Factorial of 5 is 120
 */