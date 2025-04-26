package Questions_Practice;
// Leet Code 125 - Valid Palindrome
public class _016_Valid_Palindrome {
    public static boolean palindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
//        System.out.println(palindrome(str));
        if(palindrome(str)){
            System.out.println("yes, it is palindrome");
        }
        else{
            System.out.println("No, it is not a palindrome");
        }
    }
}
/*
Output:
yes, it is palindrome
 */
