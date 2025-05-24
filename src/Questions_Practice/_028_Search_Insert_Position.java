package Questions_Practice;
// Leetcode 33: (Method 1) Search Insert Position
public class _028_Search_Insert_Position {
    public static int searchInsert(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;


        while(start <= end){
         mid = (start + end) / 2;
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
        if(target != arr[mid]){
            if(arr[mid] > target){
                return mid;
            }
            else{
                return mid+1;
            }
        }
//        return start;
        return -1;
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
Output:
2
1
4
 */