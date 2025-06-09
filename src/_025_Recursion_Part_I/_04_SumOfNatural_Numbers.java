package _025_Recursion_Part_I;
// Sum of Natural Numbers

// sum(n) = n + sum(n-1)
public class _04_SumOfNatural_Numbers {

    public static int calSum(int n ){
        if(n == 1){
            return 1;
        }
        int Snm1 = calSum(n-1); // calSum(n-1)
        int Sn = n + Snm1; // calSum(n)
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(5));
    }
}
/*
Output:
15
 */