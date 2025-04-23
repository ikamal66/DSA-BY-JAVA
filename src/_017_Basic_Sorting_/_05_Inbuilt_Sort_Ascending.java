package _017_Basic_Sorting_;
import java.util.Arrays;
public class _05_Inbuilt_Sort_Ascending {
    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,3,2,9,1,7};
        Arrays.sort(arr);
        Arrays.sort(arr,0,3); // 3 4 6 2 9 1 7 -- Output of this line
        // Array are sorted into this 0 - 2 in above line
        printArray(arr);
    }
}
/*
1 2 3 4 6 7 9
 */
