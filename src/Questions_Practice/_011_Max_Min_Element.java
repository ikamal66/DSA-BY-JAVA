package Questions_Practice;
// Maximum and minimum of an array using minimum number of comparisons
public class _011_Max_Min_Element {
    public static void find(int[] arr){
        int minimum = Integer.MAX_VALUE; // + infinity
        int maximum = Integer.MIN_VALUE; // - infinity
        for(int i=0; i<arr.length; i++){
            if(minimum > arr[i]){
                minimum = arr[i];
            }
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.println("Minimum element is : "+minimum);
        System.out.println("Maximum element is : "+maximum);
    }

    public static void main(String[] args) {
        int[] arr = {22, 14, 8, 17, 35, 3};
        find(arr);
    }
}
/*
Output:
Minimum element is : 3
Maximum element is : 35
 */