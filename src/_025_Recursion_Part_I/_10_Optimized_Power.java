package _025_Recursion_Part_I;
// Optimized way to print X^nOptimized way to print X^n
public class _10_Optimized_Power {
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(a,n/2);
        int halfPowerSq = halfPower * halfPower;
//        int halfPowerSq = optimizedPower(a , n/2) * optimizedPower(a,n/2); it time complexity: O(n)


        // n i odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2,10));
    }
}
/*
Output:
1024
 */