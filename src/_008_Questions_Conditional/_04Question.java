package _008_Questions_Conditional;

import java.util.Scanner;

/*
Write a Java program that takes a year from the user and prints whether that year is a leap year or not.
 */
public class _04Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
          if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
