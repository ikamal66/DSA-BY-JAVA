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
            }
        }
        System.out.println("Total swap = "+swap);
    }

    public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
                 System.out.println();
        }

    public static void main(String[] args) {
        int arr[] = {6,3,7,8,1};
        printArr(arr);
        bubbleSort(arr);
    }
}

/*
Bhari element last me aa jata hai bubble sort ke andar
har iteration me jo sabse bada element hoga wo last me aayega
iteration
 */

// Below code, we are only using of the one function

//import java.util.Scanner;
//
//public class practice {
//    public static void bubbleSort(int arr[]){
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j] > arr[j+1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
////    for (int num : arr) {
////        System.out.print(num + " ");
////    }
//
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,3,6,2,7,1};
//        bubbleSort(arr);
//    }
//}

