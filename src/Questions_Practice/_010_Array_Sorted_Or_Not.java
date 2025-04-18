package Questions_Practice;
/*
    problem: WAP to find whether an array is sorted or not.
 */
public class _010_Array_Sorted_Or_Not {
    public static boolean check(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {12,54,46,432,74,342,75};
        boolean sorted= check(arr);
        if(sorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
/*
Output:
Array is not sorted
 */
