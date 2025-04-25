package _019_Strings;
// Print Largest String
// Time Complexity = O(x * n )
public class _10_Print_Largest_String {
    public static void main(String[] args) {
       String[] fruits = {"apple", "Mango", "banana"};
/*
Notes:
0 : equal
< 0 : -ve str<str1
> 0 : +ve str>str1
 */
       String largest = fruits[0];
       for(int i=1; i<fruits.length; i++){
           if(largest.compareToIgnoreCase(fruits[i]) < 0){
               largest = fruits[i];
           }
       }
        System.out.println(largest);
    }
}
/*
Output:
Mango
 */
