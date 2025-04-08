package _014_Pattern_Problem_Part_2;
/*
Output:
      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      *
 */
public class _09_Diamond_Pattern {
    public static void printDiamond(int n) {
        // 1st Half:
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half:
        for(int i=n; i>=1; i--){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printDiamond(4);
    }
}
