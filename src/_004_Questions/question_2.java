package _004_Questions;
import java.util.Scanner;

/*
 In a program,input the side of a square.You have to output the area of the square
  */
public class question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area of square is: "+area);
    }
}
/*
output:
    Enter the side of the square:
    4
    The area of square is: 16
 */
