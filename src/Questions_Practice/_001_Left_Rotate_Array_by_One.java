package Questions_Practice;
// Left Rotate Array by One
public class _001_Left_Rotate_Array_by_One {

    public static void rotateArrayByOne(int[] arr) {
        int temp = arr[0]; // Store the first element value
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // Shift elements left
        }
        arr[arr.length-1] = temp; // Place the first element at the end
    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        rotateArrayByOne(arr);
        for(int nums: arr){
            System.out.print(nums+"|");
        }
    }
}
/*
Output:
2|3|4|5|1|
 */
