package _25_Recursion_Part_I;
// Print X^n

// Time complexity = O(n)
public class _09_print_X_toThePower_n {
    public static int power(int x, int n ){
        if(n == 0){
            return 1;
        }
         int xnm1 = power(x,n-1); // x^n-1
         int xn = x * xnm1; // x^n = x * x^n-1
         return xn;

         // Direct
//        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
/*
Output:
1024
 */