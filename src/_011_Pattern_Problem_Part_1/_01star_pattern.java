package _011_Pattern_Problem_Part_1;
// Simple star pattern in increasing order
/*
Output:
    *
    * *
    * * *
    * * * *
 */
public class _01star_pattern {
    public static void main(String[] args) {
        int n = 4;
       for(int line = 1; line<=n; line++){
           for(int star = 1; star<=line; star++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
