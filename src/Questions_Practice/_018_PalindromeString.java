package Questions_Practice;

public class _018_PalindromeString {
    public static boolean palindrome(String str){
        // madam - madam  -- this is a palindrome
        // kamal -- lamak --this is not a palindrome

        // Time complexity = O(n);

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecarr";
        if(palindrome(str)){
            System.out.println("Yes, it is a palindrome");
        }
        else{
            System.out.println("No, it is not a palindrome");
        }
    }
}
/*
Output:
No, it is not a palindrome
 */
