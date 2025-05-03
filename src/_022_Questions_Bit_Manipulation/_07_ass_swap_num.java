package _022_Questions_Bit_Manipulation;

public class _07_ass_swap_num {
    public static void swapNumbers(int x, int y ){
        System.out.println("Before swapping x value: "+x+" and y: "+y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After swapping x value: "+x+" and y: "+y);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        swapNumbers(x,y);
    }
}
