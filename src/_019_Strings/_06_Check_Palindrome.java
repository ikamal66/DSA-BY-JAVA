package _019_Strings;
// Check if a String is Palindrome
// Time Complexity - O(n)
public class _06_Check_Palindrome {
    // Palindrome words eg: noon, madam, racecar
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
            // not a palindrome
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        if (isPalindrome(str)) {
            System.out.println("Yes, Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
/*
Output:
Yes, Palindrome
 */
