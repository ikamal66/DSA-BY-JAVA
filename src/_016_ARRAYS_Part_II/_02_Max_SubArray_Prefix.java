package _016_ARRAYS_Part_II;
// Maximum SumArray, using of Prefix method
// Time Complexity = O(n^2)
public class _02_Max_SubArray_Prefix {
    public static void maxSubarraySum(int[] arr){
        int currentSum = 0;
        int maxSum  = Integer.MIN_VALUE; // minus infinity
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        // calculating prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currentSum = i == 0 ? prefix[j]: prefix[j]-prefix[i-1];

                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void main(String[] args) {
//        int[] arr = {1,-2,6,-1,3};
        int[] arr = { -2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(arr);
    }
}

/*
Output:
Max sum = 8
 */