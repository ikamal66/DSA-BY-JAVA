package Questions_Practice;
import java.util.Arrays;

public class _020_Leetcode_136_SingleNumber {
    public static int singleNumber(int[] arr) {
     for(int i=0; i<arr.length; i++){
         int count = 0;
         for(int j=0; j<arr.length; j++){
             if(arr[i] == arr[j]){
                 count++;
             }
         }
         if(count == 1){
             return arr[i];
         }
     }
     return -1; // single number is not present
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,9};
        System.out.println(singleNumber(arr));

    }
}
/*
Output:
9
 */