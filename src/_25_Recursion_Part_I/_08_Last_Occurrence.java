package _25_Recursion_Part_I;
// Find the Last Occurence of an element in an array

public class _08_Last_Occurrence {
    public static int lastOccurence(int[] arr, int key, int i){
        if( i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        System.out.println(lastOccurence(arr,5,0));
    }
}
/*
Output:
3
 */