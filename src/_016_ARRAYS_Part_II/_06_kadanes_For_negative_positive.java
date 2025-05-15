package _016_ARRAYS_Part_II;
// Kadanes for negative and positive numbers
// Time complexity = O(n)
public class _06_kadanes_For_negative_positive {
    public static void kadanes(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++){
            currentSum = Math.max(arr[i], (currentSum+arr[i]));
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Maximum sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,-1};
        int[] arr2 = { -2,-3,4,-1,-2,1,5,-3};
        int[] arr3 = {-4,-2,-7,-9};
        kadanes(arr1);
        kadanes(arr2);
        kadanes(arr3);
    }
}
/*
Output:
Maximum sum is: 5
Maximum sum is: 7
Maximum sum is: -2
 */