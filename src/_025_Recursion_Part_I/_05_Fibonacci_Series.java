package _025_Recursion_Part_I;
// calculate the nth term in fibonacci
// Time Complexity = O(2^n)

//fib(n) = fib(n-1) + fib(n-2)
public class _05_Fibonacci_Series {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1); // fib(n-1)
        int fnm2 = fib(n-2); // fib(n-2)
        int fn = fnm1 + fnm2; // fib(n) = fib(n-1) + fib(n-2)
        return fn;
    }
    public static void main(String[] args) {
//        int n = 25;
        System.out.println(fib(12));
    }
}
/*
Output:
144
 */