package Questions_Practice;

import java.util.Arrays;

// Time Complexity O(nlog n)
public class _019_LeetCode_217_containsDuplicate {
    public static boolean duplicateFound(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,1};
        System.out.println(duplicateFound(arr));
    }
}
/*
Output:
true
 */
