package _012_Functions_and_Methods;

import java.util.Scanner;

public class _17_DecimalToBinary {
    public static void decToBin(int number) {
        int myNum = number;
        int pow = 0;
        int binNum = 0;

        while (number > 0) {
            int rem = number % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            number = number / 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert into a binary:");
        int num = sc.nextInt();
        decToBin(num);
    }
}
/*
output:
Enter a number to convert into a binary:
12
Binary of 12 = 1100
 */
