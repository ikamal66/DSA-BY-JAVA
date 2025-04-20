package _016_ARRAYS_Part_II;
// Time complexity = O(n)
public class _05_Trapping_Rainwater {
    public static int trappedRainWater(int[] arr){
        int n = arr.length;
        // Calculating left max boundary - auxiliary array
        int[] leftMax = new int[n];  // Declare + memory allocation
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        // Calculating right max boundary - auxiliary array
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
        // waterLevel = min(leftMax boundary, rightMax boundary)
           int  waterLevel = Math.min(leftMax[i], rightMax[i]);

        // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println("Total Trapped Rain water is: "+trappedRainWater(arr));
    }
}
/*
Output:
Total Trapped Rain water is: 11
 */