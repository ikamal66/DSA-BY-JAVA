package _016_ARRAYS_Part_II;
// Max Subarray Sum Using of Brute-force
// time complexity =  O(n^3)
public class _01_Max_Subarray_Sum_Brute {
    public static void maxSubarraySum(int[] arr){
        int currentSum = 0;
        int maxSum  = Integer.MIN_VALUE; // minus infinity

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++){
                   // subarray sum
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,2,1};
        maxSubarraySum(arr);
    }
}
/*
Output:
5
8
15
17
18
3
10
12
13
7
9
10
2
3
1
Max sum = 18
 */