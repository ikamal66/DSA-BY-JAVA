package _017_Basic_Sorting_;

public class _04_Insertion_Sort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev =i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
        for(int num: arr){
            System.out.print(num+"|");
    }
}
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
    }
}
