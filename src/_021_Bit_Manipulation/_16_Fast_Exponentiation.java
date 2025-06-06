package _021_Bit_Manipulation;

public class _16_Fast_Exponentiation {
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){ // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
        System.out.println(fastExpo(3,3));
    }
}
/*
Output:
125
27
 */
