package _019_Strings;
// String Builder
// Time Complexity = O(26)
public class _11_StringBuilder {
    public static void printChar(){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
        sb.append(ch); // It stores the word
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    public static void main(String[] args) {
        printChar();

    }
}
/*
Output:
abcdefghijklmnopqrstuvwxyz
26
 */
