package _016_ARRAYS_Part_II;
// Kadane's Max Subarray sum
// Time complexity = O(n)
public class _03_kadanes_Max_Subarray {
    public static void kadanes(int[] arr){
        int ms = Integer.MIN_VALUE; // maximum sum
        int cs = 0; // current sum

        for(int i=0; i<arr.length; i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms); // cs or ms me se jo bhi maximum hoga vo ms(maximum sum) me store ho jayega
        }
        System.out.println("our max subarray sum is : "+ms);

    }

    public static void main(String[] args) {
        int[] arr = { -2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
/*
Output:
our max subarray sum is : 7
 */