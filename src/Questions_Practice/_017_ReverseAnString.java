package Questions_Practice;

public class _017_ReverseAnString {
    public static String reverseString(String str){
        char[] str1 = str.toCharArray(); // Array formed
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            // swap
            char temp = str1[start];
            str1[start] = str1[end];
            str1[end] = temp;

            start ++;
            end --;
        }
        return new String(str1); // String are immutable so we have to use this method
    }

    public static void main(String[] args) {
        String str = "aman";
        System.out.println(reverseString(str));
    }
}
/*
Output:
nama
 */