package _022_Questions_Bit_Manipulation;
// Set the ith bit
public class _03_Set_ith_bit {
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(setIthBit(n,1));
    }
}
