package _019_Strings;
// Taking input in the String
import java.util.Scanner;

public class _02_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
//        String name = sc.next(); // use for single word
        String name = sc.nextLine();
        System.out.println(name);
    }
}
/*
Output:
Enter name:
kamal Singh
kamal Singh
 */
