package _015_ARRAYS_Part_I;
import java.util.Scanner;
/*
Linear Search:
--> Elements in an array or list are checked one by one from the start until
the target value is found or the list ends.
--> It works best for small datasets

--> Time Complexity: O(n)
 */
// Linear Search
public class _05_LinearSearch {
    public static int linearSearch(int[] numbers, int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10,12,14,16};
//        int key = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key");
        int key = sc.nextInt();

//      System.out.println(linearSearch(numbers, key)); // it is the direct method
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key at index " + index);
        }
    }
}
/*
Output:
Enter a key
3
Not found

//Again run
Enter a key
12
Key at index 5

 */