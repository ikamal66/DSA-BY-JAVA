package Questions_Practice;
/*
    Problem : WAP to find the maximum element in an array
 */
public class _008_Find_Maximum_Element_Array {
    public static void maximumNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest Number is: "+largest);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,77,22};
        maximumNumber(arr);
    }
}
/*
Output:
Largest Number is: 77
 */