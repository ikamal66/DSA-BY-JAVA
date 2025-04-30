package _021_Bit_Manipulation;
// clear ith bit -- adding 0 to the ith place
public class _10_Clear_ith_Bit {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
            return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
}
/*
Output:
8
 */
