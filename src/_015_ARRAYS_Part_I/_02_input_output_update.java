package _015_ARRAYS_Part_I;
// Operation in Arrays
import java.util.Scanner;

public class _02_input_output_update  {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
//        int physics;
//        physics = sc.nextInt();

        System.out.println("Length of array = " + marks.length);

        System.out.println("Enter your marks of: chemistry, physics and maths");
        marks[0] = sc.nextInt(); // chemistry
        marks[1] = sc.nextInt(); // physics
        marks[2] = sc.nextInt(); // maths

        System.out.println("chemistry: " + marks[0]);
        System.out.println("physics: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        // Update:
        marks[2] = marks[2]+5;
//        marks[2] = 89;
        System.out.println("Updated maths marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " +percentage+"%");
    }
}
