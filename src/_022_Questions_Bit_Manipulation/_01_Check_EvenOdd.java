package _022_Questions_Bit_Manipulation;
//  Check if a number is even or odd using bitwise operator
public class _01_Check_EvenOdd {
    public static void check(int n){
        if((n & 1) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n = 12;
        int n1 = 13;
        check(n);
        check(n1);
    }
}
/*
Output:
Even Number
Odd Number
 */