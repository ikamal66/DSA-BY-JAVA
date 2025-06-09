package _025_Recursion_Part_I;
//Print numbers in decreasing order
public class _01_printNumber_DecreasingOrder {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        printDec(10);
    }
}
/*
Output:
10 9 8 7 6 5 4 3 2 1
 */