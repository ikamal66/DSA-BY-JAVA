package Questions_Practice;
// Find the Duplicate Number Leetcode
import java.util.*;
public class _021_Find_the_duplicate_number {
    public static int findDuplicate(int[] arr){
        Arrays.sort(arr);
        int result =0;
        for(int i=0; i<arr.length-1; i++){
           result = result ^ arr[i];
           result++;
           if(result == 0){
               return arr[i];
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6};
        System.out.println(findDuplicate(arr));
    }
}
/*
Output:
-1
 */