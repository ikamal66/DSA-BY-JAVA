package _014_Pattern_Problem_Part_2;
// Hollow Rectangle
public class _01_Hollow_Rectangle {
    /*
    Output:

    * * * * *
    *       *
    *       *
    * * * * *

     */
    public static void hollow_rectangle(int totrows, int totcols){
        //outer Loop
        for(int i=1; i<=totrows; i++){
            //inner Loop
            for(int j=1; j<=totcols; j++){
                //cell -(i,j)
                if(i==1 || i==totrows || j==1 || j==totcols){
                    //Boundary cells
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4,5);

    }
}
