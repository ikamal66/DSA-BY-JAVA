package _014_Pattern_Problem_Part_2;
// Inverted Half Pyramid using of numbers
/*
Output:
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
public class _03_Inverted_Half_Pyramid_with_numbers {
    public static void inverted(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted(5);
    }
}
