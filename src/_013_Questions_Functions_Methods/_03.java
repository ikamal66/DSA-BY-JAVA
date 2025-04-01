package _013_Questions_Functions_Methods;
// Try By self palindrome
import java.util.Scanner;

/*
 Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
 */
public class _03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int realNum = number;
        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
           number = number/10;
        }
        System.out.println("\nEnter lastDigit number:");
        int lastDigit = sc.nextInt();
           if(realNum==lastDigit){
               System.out.println("Palindrome");
           }
           else{
               System.out.println("Not a palindrome");
           }
    }
}
/*
Output:
Enter number:
121
121
Enter lastDigit number:
121
Palindrome
 */
