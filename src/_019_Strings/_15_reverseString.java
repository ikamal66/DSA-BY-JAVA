package _019_Strings;

public class _15_reverseString {
    public static void main(String[] args) {
        String str = "Kamal and Kunal";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
/*
Output:
lanuK dna lamaK
 */
