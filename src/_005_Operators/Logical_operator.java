package _005_Operators;
// Logical(&& , ||, ! ) Operators
public class Logical_operator {
    public static void main(String[] args) {
        // Logical AND operator (&&)
        System.out.println(true && true);  // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // Logical OR operator (||)
        System.out.println(true || true);  // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // Logical NOT operator (!)
        System.out.println(!true);  // false
        System.out.println(!false); // true

        System.out.println((3>2) && (3<5)); // true
        System.out.println((10<4) || (12>5)); // true
        System.out.println(!(24>23)); // false
    }
}
