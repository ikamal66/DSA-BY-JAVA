package _017_Basic_Sorting_;
//Bubble sort, Selection Sort, Insertion Sort and Counting Sort
public class All_Algo {
    public static void bubbleSort(int[] arr) {
        int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.print("Bubble sort: ");
        for(int elements : arr){
            System.out.print(elements+" ");
        }
        System.out.println("\nTotal swap "+swap);
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("Selection sort: ");
        for(int elements: arr){
            System.out.print(elements+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.print("Insertion sort: ");
        for(int elements: arr){
            System.out.print(elements+" ");
        }
        System.out.println();
    }

    public static void countingSort(int[] arr){
        //Find the largest number
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //Create a new array where the index corresponds to the largest element + 1
        int[] newArr = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            newArr[arr[i]]++;
            //Our code works like that:
//            newArr[1]++; → [0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
//            newArr[9]++; → [0, 1, 0, 0, 0, 0, 0, 0, 0, 1]
//            newArr[5]++; → [0, 1, 0, 0, 0, 1, 0, 0, 0, 1]
//            newArr[3]++; → [0, 1, 0, 1, 0, 1, 0, 0, 0, 1]
//            newArr[9]++; → [0, 1, 0, 1, 0, 1, 0, 0, 0, 2]
        }

        //sorting
        int j=0;
        for(int i=0; i<newArr.length; i++){
            while(newArr[i] > 0){
                arr[j] = i;  //works as an index
                j++;
                newArr[i]--;
            }
        }
        System.out.print("Counting sort: ");
        for(int elements: arr){
            System.out.print(elements+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {1,9,5,3,9};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        countingSort(arr);
    }
}
/*
Output:
Bubble sort: 1 3 5 9 9
Total swap 3
Selection sort: 1 3 5 9 9
Insertion sort: 1 3 5 9 9
Counting sort: 1 3 5 9 9
 */