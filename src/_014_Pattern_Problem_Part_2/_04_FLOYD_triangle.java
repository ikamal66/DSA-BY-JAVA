package _014_Pattern_Problem_Part_2;
// FLOYD triangle
/*
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class _04_FLOYD_triangle {
    public static void floydTriangle(int a){
        int num = 1;
        for(int i=1; i<=a; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
    }
}
