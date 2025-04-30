package _018_Questions_2D_Array;
/*
Question: Write a program to find the sum of elements in the second row of a 2D array.
 */
public class _03_RowSum {
    public static void main(String[] args) {
        int[][] matrix =   {{5,8,9},
                            {1,4,7},
                            {2,6,3}};

        int sum = 0;
        // Brute Force
//        for(int i=1; i<=1; i++){
//            for(int j=0; j<=matrix[1].length-1; j++){
//                sum += matrix[i][j];
//            }
//        }

        //Optimal code
        for(int j=0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        System.out.println(sum);
    }
}
