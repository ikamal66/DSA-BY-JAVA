package _015_ARRAYS_Part_I;
import java.util.Scanner;
// The number of iterations found in a binary search
public class _07_Iterations_binary {
    public static int binarySearch(int[] arr, int key){
        int iteration = 0;
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            iteration++;
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                System.out.println("Total iterations are "+iteration);
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        System.out.println("Total iterations are "+iteration);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,9,12,35,75};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int index = binarySearch(arr,key);
        if(index == -1){
            System.out.println("Not found in this array");
        }
        else{
            System.out.println("Found at "+index+" index");
        }
    }
}
/*
Output
Enter the key
9
Total iterations are 1
Found at 2 index

Again run --
Enter the key
75
Total iterations are 3
Found at 5 index
 */