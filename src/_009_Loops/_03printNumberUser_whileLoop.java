package _009_Loops;
import java.util.Scanner;
// Print the number taking input from the user
public class _03printNumberUser_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much I print the number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
/*
Output:
How much I print the number:
17
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
 */
