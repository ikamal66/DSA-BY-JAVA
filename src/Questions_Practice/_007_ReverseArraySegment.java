package Questions_Practice;
// Reverse an array from any index
public class _007_ReverseArraySegment {
    public static void reverseSegment(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseSegment(arr,2,3);
        for(int elements: arr){
            System.out.print(elements+"|");
        }
    }
}
/*
Output:
1|2|4|3|5|
 */