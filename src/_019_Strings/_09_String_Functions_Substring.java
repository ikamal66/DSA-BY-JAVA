package _019_Strings;
// String Function Substring
public class _09_String_Functions_Substring {
    // It is indirect method for substring -- here,we don't use of java inbuilt substring()
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
//        System.out.println(substring(str, 0,5)); // Output: Hello

        // It is inbuilt direct function in java
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0));
    }
}
/*
Output:
Hello
 */