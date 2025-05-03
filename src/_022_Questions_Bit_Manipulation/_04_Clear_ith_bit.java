package _022_Questions_Bit_Manipulation;
// Clear the ith bit
public class _04_Clear_ith_bit {
    public static int clearIthBit(int n, int i){
        int bitMask = 1 << i;
        return n & ~(bitMask);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(clearIthBit(n,2));
    }
}
