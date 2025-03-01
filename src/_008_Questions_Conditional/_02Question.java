package _008_Questions_Conditional;
/*
WAP that it prints "You have a fever" if your temperature is above 100 and otherwise prints "You don't have a fever."
 */
public class _02Question {
    public static void main(String[] args) {
        double temp = 101;
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }

    }
}
