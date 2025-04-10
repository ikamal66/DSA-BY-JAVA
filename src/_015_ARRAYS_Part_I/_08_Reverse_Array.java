package _015_ARRAYS_Part_I;
import java.util.Arrays;
// Reverse an array
public class _08_Reverse_Array {
    public static void reversedAnArray(int[] numbers){
        int low=0 , high= numbers.length-1;

        while(low<high){
            // swap
            int temp = numbers[high];
            numbers[high] = numbers[low];
            numbers[low] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {4,6,7,9,12};
        reversedAnArray(numbers);

        // print
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println("\nPrint without for loop:");
        // Print array without using loop
        System.out.println(Arrays.toString(numbers)); // we have to use of import java.util.Arrays;
//        1️⃣ Converts Array to String

    }
}
