package Questions_Practice;
// Maximum Subarray leetcode
// Time Complexity = O(n)
public class _026_kadanes {
    public static int kadanes(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length; i++){
             cs = Math.max(arr[i], cs+arr[i]);
             ms = Math.max(ms,cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] arr1 = {-3,-5,-1,-2};
        int[] arr2 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr3 = {1};
        int[] arr4 = {5,4,-1,7,8};

        System.out.println(kadanes(arr1));
        System.out.println(kadanes(arr2));
        System.out.println(kadanes(arr3));
        System.out.println(kadanes(arr4));
    }
}
/*
Output:
-1
6
1
23
 */