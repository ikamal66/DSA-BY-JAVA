package _019_Strings;
// charAt in String
public class _05_charAt_Method {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Kamal Singh";
//        System.out.println(str.charAt(0)); // Output: K
        printLetters(str); // Output: K a m a l   S i n g h
    }
}
