package _007_Conditional_Statement;
import java.util.Scanner;
// if-else conditions
public class if_else {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
       else if(age>=13 && age<=17){
            System.out.println("Teen");
        }
        else{
            System.out.println("Kid");
        }
    }
}
