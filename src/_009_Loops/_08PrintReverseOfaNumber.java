package _009_Loops;
// 12345 --> 54321
public class _08PrintReverseOfaNumber {
    public static void main(String[] args) {
        int number = 123456;
        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
    }
}
/*
output:
654321
 */