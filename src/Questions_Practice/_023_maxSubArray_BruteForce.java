package Questions_Practice;

// Maximum SubArray Sum using of Brute Force
// Time Complexity = O(n^3)
public class _023_maxSubArray_BruteForce {
    public static void maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currentSum= 0;
                for(int k=i; k<=j; k++){
                    currentSum += arr[k];
                    if(maxSum < currentSum){
                        maxSum = currentSum;
                    }
                }
            }
        }
        System.out.println("Maximum Sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {5,-2,4,1};
        maxSubArray(arr);
    }
}
/*
Output:
Maximum Sum is: 8
 */