package _021_Bit_Manipulation;
// set ith bit -- adding 1 to the ith place
public class _09_Set_ith_bit {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10,2));
    }
}
/*
Output:
14
 */