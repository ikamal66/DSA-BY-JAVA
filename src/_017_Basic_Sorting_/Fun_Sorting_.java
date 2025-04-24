package _017_Basic_Sorting_;

import java.util.Scanner;

public class Fun_Sorting_ {
    public static void print(int[] arr){
        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr);
            System.out.println();
        }
    }
    public static void selectionSort(int[] arr){
        for(int  i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            print(arr);
            System.out.println();
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
            print(arr);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Take input for array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Make a copy of the original array to show before sorting
        int[] original = arr.clone();

        System.out.println("Choose Sorting algorithm: ");
        System.out.println(" 1. Bubble Sort\n 2. Insertion Sort\n 3. Selection Sort");
        int choice = sc.nextInt();
        if(choice == 1){
            bubbleSort(arr);
        }
        else if(choice == 2){
            insertionSort(arr);
        }
        else if(choice == 3){
            selectionSort(arr);
        }
        else{
            System.out.println("Invalid Number");
        }

        // Display original array
        System.out.print("\nOriginal Array: ");
        print(original);
        System.out.println();
    }
}
/*
Output:
Enter the number of elements: 6
Enter 6 elements:
8
5
2
9
1
4
Choose Sorting algorithm:
 1. Bubble Sort
 2. Insertion Sort
 3. Selection Sort
3
1 5 2 9 8 4
1 2 5 9 8 4
1 2 4 9 8 5
1 2 4 5 8 9
1 2 4 5 8 9

Original Array: 8 5 2 9 1 4
 */