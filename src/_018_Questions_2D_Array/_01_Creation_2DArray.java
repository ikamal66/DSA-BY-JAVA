package _018_Questions_2D_Array;

import java.util.Scanner;

/*
Question: Create a 2D array (matrix) with 3 rows and 3 columns.
         Fill it with numbers from 1 to 9.
 */
public class _01_Creation_2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+(n*m)+" elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
Output:
Enter 9 elements
1 2 3 4 5 6 7 8 9

1 2 3
4 5 6
7 8 9
 */
