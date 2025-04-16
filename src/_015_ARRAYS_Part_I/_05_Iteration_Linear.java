package _015_ARRAYS_Part_I;
import java.util.Scanner;
// Found iterations in Linear search
public class _05_Iteration_Linear {
    public static int linearSearch(int[] arr, int key){
        int iteration = 0;
        for(int i=0; i<arr.length; i++){
            iteration++;
            if(arr[i] == key){
                System.out.println("Total iterations are "+iteration);
                return i;
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
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("Not found in this array");
        }
        else{
            System.out.println("Key Found at "+index+" index");
        }
    }
}
/*
Output:
Enter the key
12
Total iterations are 4
Key Found at 3 index
 */