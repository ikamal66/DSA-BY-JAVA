package _021_Bit_Manipulation;
// clear range of bit
public class _13_Clear_Range_of_bits {
    public static int clearRangeBit(int n, int i, int j){
      int a = ((~0) << (j+1));
      int b = ((1<<i)-1);
      int bitMask = a | b;
      return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeBit(10,2,4));
    }
}
/*
Output:
2
 */
