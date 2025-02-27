package _005_Operators;
// Assignment Operators +=, -=, *=, /=, %=
public class Assignment_Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // Addition assignment
        x += y; // x = x + y
        System.out.println(x); // 30

        // Subtraction assignment
        x -= y; // x = x - y
        System.out.println(x); // 10

        // Multiplication assignment
        x *= y; // x = x * y
        System.out.println(x); // 200

        // Division assignment
        x /= y; // x = x / y
        System.out.println(x); // 10

        // Remainder assignment
        x %= y; // x = x % y
        System.out.println(x); // 10
    }
}
