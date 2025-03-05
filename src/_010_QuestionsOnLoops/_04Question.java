package _010_QuestionsOnLoops;

import java.util.Scanner;

/*
Write a program to print the multiplication table of a number N, entered by the user.
 */
public class _04Question {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
    }
}
/*
output:
Enter a number:
7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
 */

