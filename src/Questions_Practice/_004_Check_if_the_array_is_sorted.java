package Questions_Practice;
// Check if the array is sorted or not
public class _004_Check_if_the_array_is_sorted {
   public static boolean arraySortedOrNot(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Is array sorted? - "+arraySortedOrNot(arr));
    }
}
/*
    if(arr[i] < arr[i+1]){
    return true;
    we can't do that because if any pair satisfies this condition, this method immediately returns true
    ex: 1,3,2,7,6;
    it will check where arr[i] < arr[i+1], here 1<3 it will return true,
    without checking further numbers

That's why we don't use this
}

 */

/*
Output:
Is array sorted? - true
 */
