package _017_Basic_Sorting_;

public class _06_Counting_Sort {
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
    }
}
/*
Output:
1 1 2 3 3 4 4 7
 */