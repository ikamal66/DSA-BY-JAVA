package _025_Recursion_Part_I;
// Find Array is Sorted or not

// Time & Space Complexity = O(n)
public class _06_IsSortedArray {
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int[] arr1 = { 1,2,7,4,5};
        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr1,0));
    }
}
/*
Output:
true
false
 */