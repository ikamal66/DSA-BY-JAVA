package _007_Conditional_Statement;
import java.util.Scanner;
// Find the Even or Odd numbers
public class EVEN_or_ODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" it is an even number");
        }
        else{
            System.out.println(num+" it is an odd number");
        }
    }
}
