package _021_Bit_Manipulation;
// Is this number a power of 2 ?
public class _14_isPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(14));
        System.out.println(isPowerOfTwo(16));
    }
}
/*
Output:
false
false
true
 */