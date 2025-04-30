package _018_Questions_2D_Array;
/*
Question:
arr = [
  [5, 8, 9],
  [1, 4, 7],
  [2, 6, 3]
]
What is the value at arr[1][2]?
 */
public class _02_Simple_Access {
    public static void main(String[] args) {
        int[][] matrix = {{5,8,9},
                          {1,4,7},
                          {2,6,3}};

        int value = matrix[1][2];
        System.out.println(value);
    }
}
/*
Output:
7
 */
