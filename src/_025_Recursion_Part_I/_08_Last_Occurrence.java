package _025_Recursion_Part_I;
// Find the Last Occurrence of an element in an array

public class _08_Last_Occurrence {
    public static int lastOccurrence(int[] arr, int key, int i){
        if( i == arr.length){
            return -1;
        }
        int isFound = lastOccurrence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //Give same answer as above func
    public static int lastOcc(int[] arr, int i, int key){
        //base condition
        if(i < 0){
            return -1;
        }

        //kaam
        if(arr[i] == key){
            return i;
        }

        return lastOcc(arr,i-1,key);
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        System.out.println(lastOccurrence(arr,5,0));
        System.out.println(lastOcc(arr,arr.length-1,5));
    }
}
/*
Output:
3
3
 */