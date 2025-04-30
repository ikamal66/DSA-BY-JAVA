package _018_Questions_2D_Array;
/*
Question: Write a program to print all elements of a 2D array using nested loops.
 */
public class _04_Print_Elements {
    public static void main(String[] args) {
        int[][] matrix =   {{5,8,9},
                            {1,4,7},
                            {2,6,3}};

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
Output:
5 8 9
1 4 7
2 6 3
 */