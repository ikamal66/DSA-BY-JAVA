package _018_2D_Arrays;

import java.util.Scanner;

public class _04_Creation_Of_2D_Array {
    public static boolean search(int[][] matrix, int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" +i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // 3x3 matrix
        int n=3, m=3;
//        int n = matrix.length, m = matrix[0].length; // It is another method to represent above line without mentioning the numbers
        // Here, n = rows, and m = columns

        System.out.println("Enter "+(n*m)+" values");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){ // It is for row wise traversal
            for(int j=0; j<m; j++){ // It is for column wise traversal
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix,1);
    }
}
/*
Output:
1 2 3 4 5 6 7 8 9
1 2 3
4 5 6
7 8 9
Found at cell (2,2)
 */