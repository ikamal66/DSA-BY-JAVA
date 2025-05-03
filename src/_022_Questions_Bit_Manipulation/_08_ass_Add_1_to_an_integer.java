package _022_Questions_Bit_Manipulation;
// Add 1 to an integer using Bit Manipulation
public class _08_ass_Add_1_to_an_integer {
    public static int twoComplement(int n){
         return ~(n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(twoComplement(5));

    }
}
/*
Output:
-6
 */