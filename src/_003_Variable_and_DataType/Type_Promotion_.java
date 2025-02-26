package _003_Variable_and_DataType;
// Type Promotion
public class Type_Promotion_ {
    public static void main(String[] args) {
        float a = 33.2f;
        int b = 10;
        char c = 'd';
        double d = 30.5;
        long e = 100;
        double total = a+b+c+d+e;
        System.out.println(total);
        /*
        byte a1 = 5;
        byte b1 = a1*2;
        System.out.println(b1);
        Throw an error
        java: incompatible types: possible lossy conversion from int to byte
        */
        byte a1 = 5;
        byte b1 = (byte)(a1*2);
        System.out.println(b1);
    }
}
/*
Output:
273.6999969482422
10
 */