package _008_Questions_Conditional;
import java.util.Scanner;

/*
Write a Java program to input week number (1-7) and print the day of week name using switch case.
 */
public class _03Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number: ");
        int weekNumber = sc.nextInt();
        switch(weekNumber){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                 System.out.println("Sunday");
                 break;
        }
    }
}
