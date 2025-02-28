package _007_Conditional_Statement;
import java.util.Scanner;
// Tax Calculator
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income: ");
        int income= sc.nextInt();
        if(income<500000){
            System.out.println("You don't need to pay tax ");
        }
        else if(income>=500000 && income<1000000){
            System.out.println("You have to pay "+income*(0.2)+" tax");
        }
        else{
            System.out.println("You have to pay "+income*(0.3)+" tax");

        }
    }
}
