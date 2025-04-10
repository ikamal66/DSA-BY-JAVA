package _015_ARRAYS_Part_I;

import java.util.Scanner;

/*
Binary Search:
--> Must be sorted Array
--> Time Complexity = O(log n)
--> mid = (low+high)/2
 */
public class _07_BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key){ // found
                return  mid;
            }
            if(numbers[mid] < key){ // Right 2nd half
                start = mid +1;
            }
            else{ // Left 1st Half
                end = mid-1;
            }
        }
        return -1; // Key not found in array
    }
    public static void main(String[] args) {
        int numbers[] = {5,8,12,17,33,77,89};
//        int key = 17;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        System.out.println("Index for key is: "+binarySearch(numbers,key));
    }
}
/*
Output:
17
Index for key is: 3

 */