package Questions_Practice;
import java.util.Arrays;
// Majority Element leetcode
// Time Complexity = O(n log n)
public class _025_Majority_Element {
    public static int majorityElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
// A majority element in an array is an element that appears more than ⌊n/2⌋ times,
// where n is the size of the array.
