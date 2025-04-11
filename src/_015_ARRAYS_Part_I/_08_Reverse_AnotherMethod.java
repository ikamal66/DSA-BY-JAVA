package _015_ARRAYS_Part_I;
// Reverse an array using only a for loop
public class _08_Reverse_AnotherMethod {
    public static void reverse(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+"|");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,6,7,9,12};
        reverse(arr);
    }

}
