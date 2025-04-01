package _013_Questions_Functions_Methods;

import java.util.Scanner;

/*
Question:
 Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method
 */
public class _02 {
    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println(isEven(num1));
    }
}
/*
output:
Enter num1
2
true
 */