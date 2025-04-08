package _014_Pattern_Problem_Part_2;
/*
Output:
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
 */
public class _07_Solid_Rhombus {
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombus(5);
    }
}
