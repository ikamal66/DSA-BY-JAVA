package _012_Functions_and_Methods;
// Overloading using of  different data types
public class _12_FunctionOverloading_dataTypes {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, int b) {
        return a + b;
    }
    public static float sum(float a,  float b) {
        return a+b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(3.4f, 9));
        System.out.println(sum(12.4f,4.6f));
        System.out.println(sum(10.0d, 3.0f));
    }
}
/*
Output:
7
12.4
17.0
13.0
 */
