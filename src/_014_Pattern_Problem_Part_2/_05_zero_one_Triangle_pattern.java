package _014_Pattern_Problem_Part_2;
// Zero-one Triangle
/*
Output:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
public class _05_zero_one_Triangle_pattern {
    public static void zeroOne(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOne(5);
    }
}
