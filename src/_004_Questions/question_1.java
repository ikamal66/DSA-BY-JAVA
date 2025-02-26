package _004_Questions;
import java.util.Scanner;

/*
     In a program, input 3 numbers: A,B and C.
     You have to output the average of these three numbers
 */
public class question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3: ");
        int num3 = sc.nextInt();
        double average = (num1+num2+num3)/3.0;
        System.out.println("Average of these numbers is: "+average);
    }
}
/*
Output:
    Enter the num1:
    23
    Enter the num2:
    25
    Enter the num3:
    30
    Average of these numbers is: 26.0
 */
