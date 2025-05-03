package _022_Questions_Bit_Manipulation;
// Count number of 1s in the binary representation (Hamming Weight)
public class _05_Count_1s {
    public static int count1s(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
               count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(count1s(n));
    }
}
