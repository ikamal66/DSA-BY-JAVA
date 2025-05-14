package Questions_Practice;
//  Power of Two Leetcode
public class _022_LeetCode_231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // n &(n-1)
        return n>0 && ((n & (n-1)) == 0);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo(n));
    }
}
