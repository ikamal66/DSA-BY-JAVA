package _012_Functions_and_Methods;
// Binary to Decimal
import java.util.Scanner;

public class _16_BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum+lastDigit*(int)Math.pow(2,pow);

            pow++;
            binNum =binNum/10; // Remove the last digit
        }
        System.out.println("Decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number to convert into Decimal:");
        int num = sc.nextInt();
        binToDec(num);
    }
}
/*
Output:
Enter Binary number to convert into Decimal:
101
Decimal of 101 = 5
 */