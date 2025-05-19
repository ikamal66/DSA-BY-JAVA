package _016_Questions_Arrays;
/*
Problem: Given an integer array nums, return true if any value appears at least twice in the
        array, and return false if every element is distinct.
        Example 1:
        Input: nums = [1, 2, 3, 1]
        Output: true
        Example 2:
        Input: nums = [1, 2, 3, 4]
        Output: false
 */
public class _01_Duplicate_Check {
    public static boolean check(int[] arr){
        for(int i=0; i<arr.length-1; i++){
           for(int j=i+1; j<arr.length; j++){
               if(arr[i] == arr[j]){
                   return true;
               }
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(check(arr));
    }
}
/*
Output:
true
 */