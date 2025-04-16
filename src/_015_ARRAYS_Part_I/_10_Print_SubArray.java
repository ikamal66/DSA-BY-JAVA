package _015_ARRAYS_Part_I;
// Print the SubArray
public class _10_Print_SubArray {
    public static void printSubArray(int[] arr){
        int totalSubarray = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ // print
                    System.out.print(arr[k]+" "); // subarray
                }
                System.out.println();
                totalSubarray++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + totalSubarray);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArray(arr);
    }
}
/*
Output:
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10

4
4 6
4 6 8
4 6 8 10

6
6 8
6 8 10

8
8 10

10

Total subarrays = 15
 */