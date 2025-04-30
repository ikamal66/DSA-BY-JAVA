package _021_Bit_Manipulation;
// Get ith bit value
public class _08_Get_ith_bit {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(2,2));
    }
}
// 2 in Binary is: 1010 -- 2nd index value is 0, so output is 0
// if i=3, output will be 1

/*
output:
0
 */
