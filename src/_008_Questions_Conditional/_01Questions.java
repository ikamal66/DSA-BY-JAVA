package _008_Questions_Conditional;
import java.util.Scanner;

/*
Write a Java program to get a number from the user and print whether it is positive or negative.
 */
public class _01Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Negative Number !");
        }
        else{
            System.out.println("Positive Number !");
        }
    }
}
