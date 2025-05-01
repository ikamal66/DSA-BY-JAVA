package _022_Questions_Bit_Manipulation;
// Check if the ith bit is set
public class _02_check_ith_bit_set {
    public static int check(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(check(n,3));
    }
}
/*
Output:
1
 */
