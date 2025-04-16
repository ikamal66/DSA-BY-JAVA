package Questions_Practice;
// Find the key in Array using of Linear Search
public class _003_Linear_Search_Array {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int[] arr = {2, 3, 4, 5, 3};
        System.out.println(linearSearch(arr,3));
    }
}
/*
Output:
1
 */