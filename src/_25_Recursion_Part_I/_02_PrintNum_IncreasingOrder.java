package _25_Recursion_Part_I;

public class _02_PrintNum_IncreasingOrder {
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}

// 1 2 3 4 5 6 7 8 9 10