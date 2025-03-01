package _009_Loops;
import java.util.Scanner;
// Keep entering numbers till user enters a multiple of 10
public class _11PrintUntil_BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter number");
        int num = sc.nextInt();
            System.out.println(num);
            if(num%10==0){
                break;
            }
        }
        System.out.println("You Entered multiple of 10 so exit the loop");
    }
}
/*
Output:
Enter number
12
12
Enter number
67
67
Enter number
68
68
Enter number
34
34
Enter number
10
10
You Entered multiple of 10 so exit the loop
 */