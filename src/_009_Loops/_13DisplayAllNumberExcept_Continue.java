package _009_Loops;
import java.util.Scanner;
//Display all numbers entered by the user except multiples of 10

public class _13DisplayAllNumberExcept_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }

    }
}
/*
Output:
Enter a number:
12
12
Enter a number:
15
15
Enter a number:
10
Enter a number:
20
Enter a number:
22
22
Enter a number:
 */