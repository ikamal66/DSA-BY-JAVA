package _021_Bit_Manipulation;
// check even or odd
public class _07_Odd_Even_check {
    public static void oddEven(int n){
        int bitmask = 1;
        if(((n & bitmask) == 0)){
            // even number
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(12);
        oddEven(3);
        oddEven(19);
    }
}
/*
Output:
Even number
Odd number
Odd number
 */
