package Questions_Practice;
/*
    Problem : WAP to find the minimum element in an array
 */
public class _009_Find_Minimum_Element_Array {
    public static void minimumNumber(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element is "+smallest);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,77,22};
        minimumNumber(arr);
    }
}
/*
Output:
Smallest Element is 2
 */