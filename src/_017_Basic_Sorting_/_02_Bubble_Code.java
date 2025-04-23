package _017_Basic_Sorting_;
// Bubble Sort Code
public class _02_Bubble_Code {
    public static void bubbleSort(int arr[]){
        int swap = 0;
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                // How bubble sort works -
//                printArr(arr);
//                System.out.println();
            }
        }
        System.out.println("Total swap = "+swap);
    }

    public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

    public static void main(String[] args) {
        int arr[] = {6,3,7,8,1};
        bubbleSort(arr);
        System.out.print("Sorted array : ");
        printArr(arr);
    }
}
/*
Output:
Total swap = 5
Sorted array : 1 3 6 7 8
 */