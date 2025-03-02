package _011_Pattern_Problem_Part_1;
// Half Pyramid by using of numbers
/*
    1
    12
    123
    1234
    12345
 */
public class _03Half_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
