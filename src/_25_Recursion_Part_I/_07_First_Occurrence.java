package _25_Recursion_Part_I;
// Find the First Occurence of an element in an array

public class _07_First_Occurrence {
    public static int firstOccurence(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key ,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {8,8,6,9,5,10,2,3,3};
        System.out.println(firstOccurence(arr,5,0));
        System.out.println(firstOccurence(arr,8,0));
    }
}
/*
Output:
4
0
 */