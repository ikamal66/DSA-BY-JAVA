package _021_Bit_Manipulation;
// update the ith bit by 0 and 1
public class _11_Update_ith_Bit {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int update(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }

        //other method--
//        n = clearIthBit(n,i);
//        int bitMask = newBit<<i;
//        return n | bitMask;

    }

    public static void main(String[] args) {
        System.out.println(update(10,2,1));
    }
}
/*
Output:
14
 */
