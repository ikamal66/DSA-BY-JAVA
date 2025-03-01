package _009_Loops;
// 12345 --> 54321
public class _15ReverseTheGivenNumber {
    public static void main(String[] args) {
        int number = 123456;
        int rev = 0;
        while(number>0){
            int lastDigit = number%10;
            rev = (rev*10)+lastDigit;
            number = number/10;
        }
        System.out.println(rev);
    }
}
/*
output:
654321
 */
