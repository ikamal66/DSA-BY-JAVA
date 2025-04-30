package _018_2D_Arrays;

public class _08_Searching_ {
    public static boolean staircaseSearch(int[][] matrix, int key){ // time complexity = O(n+m)
        int row = matrix.length-1;
        int col = 0;

        while(col<matrix.length && row>=0){
            if(matrix[row][col] == key){
                System.out.println("Key Found at index ( "+row+","+col+" ) -- using of staircaseSearch");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static boolean searchKey(int[][] matrix, int key){ // time complexity = O(n^2)
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at index ( "+i+","+j+" )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},
//                          {4,5,6},
//                          {7,8,9} }; // 3x3

        int[][] matrix =    {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key = 39 ;
        staircaseSearch(matrix,key);
        searchKey(matrix,key);

    }
}
/*
Output:
Key Found at index ( 3,2 ) -- using of staircaseSearch
Found at index ( 3,2 )
 */
