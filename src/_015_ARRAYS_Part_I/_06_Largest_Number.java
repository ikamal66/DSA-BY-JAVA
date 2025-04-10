package _015_ARRAYS_Part_I;
// Largest Number
public class _06_Largest_Number {
    public static int getLargest(int[] number){
        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity

        for(int i=0; i<number.length; i++){
            if(largest <  number[i]){
                largest = number[i]; // update
            }
            if(smallest > number[i]){
                smallest = number[i]; // update
            }
        }
        System.out.println("The smallest value is : "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] number = {-8,2,5,7,3,45,22,6};
        System.out.println("The largest number is: "+getLargest(number));

    }
}
/*
Output:
The smallest value is : -8
The largest number is: 45
 */