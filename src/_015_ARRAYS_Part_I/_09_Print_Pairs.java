package _015_ARRAYS_Part_I;
/*
    Pairs in an array
    --> Time Complexity = O(n^2)
 */

public class _09_Print_Pairs {
    public static void printPairs(int numbers[]){
        int totalPairs = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; // 2,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current +","+ numbers[j] +") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
/*
Output:
(2,4) (2,6) (2,8) (2,10)
(4,6) (4,8) (4,10)
(6,8) (6,10)
(8,10)

Total Pairs: 10
 */