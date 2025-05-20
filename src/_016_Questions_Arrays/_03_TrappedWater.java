package _016_Questions_Arrays;

public class _03_TrappedWater {
    public static int trappedWater(int[] arr){
        int n = arr.length;
        // Calculating the leftMax
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        // Calculating the rightMax
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=arr.length-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel-arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedWater(arr));
    }
}
/*
Output:
6
 */
