package _009_Loops;
import java.util.Scanner;
// Sum of first n Natural numbers using of while loop

public class _05sumOfFirstNo_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Total sum is: "+sum);

    }
}
/*
Output:
Enter the number
5
Total sum is: 15
 */