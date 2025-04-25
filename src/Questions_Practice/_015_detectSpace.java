package Questions_Practice;
/*
    Problem : Write a java program to detect double and triple spaces in a String.
 */
public class _015_detectSpace {
    public static void main(String[] args) {
        String str = "Ram and  shyam   are friends";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("    "));
        // if -1 occur, means not present in the string
    }
}
/*
Output:
7
14
-1
 */
