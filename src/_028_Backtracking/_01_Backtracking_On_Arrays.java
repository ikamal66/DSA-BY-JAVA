package _028_Backtracking;
//Backtracking on Arrays
//Time Complexity = O(n)
//Space Complexity = O(n)
public class _01_Backtracking_On_Arrays {
    public static void changeArr(int[] arr, int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr) ;
            return;
        }

        //Recursion(kaam)
        arr[i] = val;
        changeArr(arr,i+1,val+1); //function call step
        arr[i] = arr[i] - 2; //backtracking step
    }

    public static void printArr(int[] arr){
        for(int elements: arr){
            System.out.print(elements+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
/*
Output:
1 2 3 4 5
-1 0 1 2 3
 */