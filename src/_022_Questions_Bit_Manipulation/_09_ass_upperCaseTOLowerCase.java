package _022_Questions_Bit_Manipulation;

public class _09_ass_upperCaseTOLowerCase {
    public static void upperToLower(){
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print((char) (ch | ' '));
        }
    }

    public static void main(String[] args) {
        upperToLower();
    }
}
/*
Output:
abcdefghijklmnopqrstuvwxyz
 */
