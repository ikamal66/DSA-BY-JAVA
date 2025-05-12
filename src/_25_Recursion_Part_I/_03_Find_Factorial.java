package _25_Recursion_Part_I;
// Factorial

// fac(n) = n * fac(n-1)
public class _03_Find_Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1); // f(n-1)
        int fn = n * fnm1; // f(n)
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
/*
Output:
120
 */