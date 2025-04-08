package _014_Pattern_Problem_Part_2;
/*
Output:
        * * * * *
      *       *
    *       *
  *       *
* * * * *
 */
public class _08_Hollow_Rhombus {
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
