package Questions_Practice;
/*
    Problem : WAP to reverse an array
 */
public class _006_Reverse_An_Array {
    public static void reverse(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+"|");
        }
    }

    public static void reverseByAnotherMethod(int[] arr){
        // Time Complexity: O(n)
        int low = 0;
        int high = arr.length-1;
        while(low < high){
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,77,22};
        reverse(arr);
        System.out.println();

        reverseByAnotherMethod(arr);
        for(int elements: arr){
            System.out.print(elements+"|");
        }
    }
}
/*
Output:
22|77|2|5|3|
22|77|2|5|3|
 */



