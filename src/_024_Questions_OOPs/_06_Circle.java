package _024_Questions_OOPs;

class Circle{
    int radius;
    public double area(){
        return Math.PI*radius*radius;
    }

    public int diameter(){
        return 2*radius;
    }
}
public class _06_Circle {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.radius = 4;
        System.out.println(cr.area());
        System.out.println(cr.diameter());
    }
}
/*
Output:
50.26548245743669
8
 */