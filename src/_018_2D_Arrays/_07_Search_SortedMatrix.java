package _018_2D_Arrays;
// Search in sorted Matrix
public class _07_Search_SortedMatrix {
    public static boolean staircaseSearch(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found key at (" +row +","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--; // left
            }
            else{
                row++; // bottom
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix =    {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key = 332 ;
        staircaseSearch(matrix,35);
    }
}
/*
Output:
Found key at (1,2)
 */