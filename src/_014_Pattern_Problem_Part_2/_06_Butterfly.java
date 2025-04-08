package _014_Pattern_Problem_Part_2;
/*
Output:

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

 */
// Butterfly Pattern
public class _06_Butterfly {
    public static void butterFly(int n){
        // 1st Half
        for(int i=1; i<=n; i++){
            // stars -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // stars -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half
        for(int i=n; i>=1; i--){
            // stars -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // stars -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterFly(5);
    }
}
