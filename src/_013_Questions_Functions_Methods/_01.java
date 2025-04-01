package _013_Questions_Functions_Methods;
import java.util.Scanner;

/*
    Write a Java method to compute the average of three numbers.
 */
public class _01 {
    public static float average(int a, int b, int c){
        return (a+b+c)/3.0f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter your num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter your num3:");
        int num3 = sc.nextInt();
        System.out.println("Average is: "+average(num1, num2, num3));
    }
}
/*
Output:
Enter your num1:
5
Enter your num2:
4
Enter your num3:
5
Average is: 4.6666665
 */
