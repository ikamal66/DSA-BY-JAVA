package Questions_Practice;
// Find the Largest Element in an Array
public class _002_Largest_Element_in_Array {
    public static int largestElement(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(result < nums[i]){
                result = nums[i];
            }
        }
        return result;

    }

    public static void main(String[]args){
        int[] nums = {3,3,6,1};
        System.out.println(largestElement(nums));
    }
}
/*
Output:
6
 */