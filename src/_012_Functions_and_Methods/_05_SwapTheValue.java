package _012_Functions_and_Methods;
// Swapping of the numbers
public class _05_SwapTheValue {
    public static void main(String[] args) {
        // Swap - value exchange
        int a = 5;
        int b = 10;
        System.out.println("The value of a before swapping is "+a);
        System.out.println("The value of b before swapping is "+b +"\n");

        // Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a after swapping is "+a);
        System.out.println("The value of b after swapping is "+b);
    }
}
/*
Output:
The value of a before swapping is 5
The value of b before swapping is 10

The value of a after swapping is 10
The value of b after swapping is 5
 */