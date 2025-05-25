package Questions_Practice;
// Leetcode 33: Search in Rotated Sorted Array
public class _030_Search_inRotated_Sorted_Array {
    public static int rotatedSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            // 1st part
            if(start <= mid){
                if(arr[start] <= target && target <= arr[mid] ){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

            // 2nd part
            else {
                if(arr[mid] >= target && target <= arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotatedSearch(arr,target));
    }
}
/*
Output:
4
 */
