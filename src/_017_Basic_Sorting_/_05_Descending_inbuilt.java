package _017_Basic_Sorting_;
import java.util.Arrays;
import java.util.Collections;
// In Collections the object is made,so we use of 'Integer' instead of using the 'int'
public class _05_Descending_inbuilt {
    public static void printArray(Integer[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {5,3,7,2,9,1};
        Arrays.sort(arr,Collections.reverseOrder());
//        Arrays.sort(arr,0,3,Collections.reverseOrder()); // 7 5 3 2 9 1  --  Output of this line
        printArray(arr);
    }
}
/*
9 7 5 3 2 1
 */