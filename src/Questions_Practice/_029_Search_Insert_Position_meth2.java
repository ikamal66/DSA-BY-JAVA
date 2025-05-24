package Questions_Practice;
// Leetcode 33: (Method 2) Search Insert Position

public class _029_Search_Insert_Position_meth2 {
    public static int searchInsert(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            if(arr[mid] < target){
                start = mid +1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(searchInsert(arr,target1));
        System.out.println(searchInsert(arr,target2));
        System.out.println(searchInsert(arr,target3));
    }
}
/*
2
1
4
 */