package Questions_Practice;

import java.util.Scanner;

//WAP to find out whether a given number is present in an array or not.
public class _005_NumberPresent_In_Array_Or_Not {
    public static boolean searchNumber(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]== key){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,22,77,12,33,43};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int key = sc.nextInt();
        boolean found = searchNumber(arr,key);
        if(found){
            System.out.println("Present in an Array");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
/*
Output:
Enter a number:
12
Present in an Array

--Again Run
Enter a number:
463
Not Present
 */