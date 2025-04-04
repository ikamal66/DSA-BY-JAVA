package _014_Pattern_Problem_Part_2;
// Rotated Half Pyramid problem
/*
Output:

       *
     * *
   * * *
 * * * *

 */
public class _02_Inverted_Rotated_Half_Pyramid {
    public static void pyramid(int n){
        // outer Loop -- how many rows
        for(int i=1; i<=n; i++){
            // Print the empty spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Print the Stars
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(4);
    }
}
