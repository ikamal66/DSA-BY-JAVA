package _017_Questions_Sorting;
/*
Use the following sorting algorithms to sort an array in DESCENDING order
Bubble Sort
Selection Sort
Insertion Sort
Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
 */
public class _01 {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;
            while(prev<=0 && arr[prev] < current){
                arr[prev+1] = arr[prev];
                prev++;
            }
            arr[prev+1] = current;
        }
    }

    public static void print(int[] arr){
        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        print(arr);

        System.out.println();

        selectionSort(arr);
        System.out.print("Selection Sort: ");
        print(arr);

        System.out.println();

        insertionSort(arr);
        System.out.print("Insertion Sort: ");
        print(arr);
    }
}
/*
Output:
Bubble Sort: 8 7 6 5 4 3 3 2 1 1
Selection Sort: 8 7 6 5 4 3 3 2 1 1
Insertion Sort: 8 7 6 5 4 3 3 2 1 1
 */