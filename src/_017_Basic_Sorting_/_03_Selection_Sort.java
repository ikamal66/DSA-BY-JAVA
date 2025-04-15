package _017_Basic_Sorting_;
/*
Selection sort works by repeatedly finding the smallest element
from the unsorted portion of the list and swapping it with the first unsorted element,
gradually moving the boundary between sorted and unsorted sections
until the entire list is sorted.
This process continues until all elements have been placed in their correct positions,
making it an inefficient but simple sorting algorithm with a time complexity of O(n²)
 */
public class _03_Selection_Sort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}
