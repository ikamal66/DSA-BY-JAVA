package Questions_Practice;
// Pow(x, n) leetcode
//Time complexity O(log n)

public class _027_Find_the_Power {
    public static double myPow(double x, int n){
        return myPow1(x,n);
    }
    // first func n have int value so we change int into long so we made this 2nd func
    public static double myPow1(double x, long n){
        if(n<0){
            return 1/Math.pow(x,-n);
        }
        if(n==0 || x==1){
            return 1;
        }

        //Even Case:
        double halfPower = myPow1(x,n/2);
        double halfPowerSq = halfPower * halfPower;

        // Odd Case
        if(n%2 != 0){
            halfPowerSq = x *halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,10));
        System.out.println(myPow(2.1,3));
        System.out.println(myPow(2,-2));
        System.out.println(myPow(2,-2147483648));
    }
}
/*
Output:
1024.0
9.261000000000001
0.25
0.0
 */