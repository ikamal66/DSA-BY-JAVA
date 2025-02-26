package _003_Variable_and_DataType;
// Type Casting

public class Type_Casting {
    public static void main(String[] args) {
        /*
        float a = 23.44f;
        int b = a;
        Throw an error
        incompatible types: possible lossy conversion from float to int
         */
        float a = 23.458f;
        int b = (int) a;
        System.out.println(b);

        char c1 = 'a';
        int n = c1;
        System.out.println(n);
    }
}
/*
Output:
    23
    97
 */

