package _024_Questions_OOPs;

class Rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
public class _04_rectangle {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.length = 3;
        rc.breath = 2;
        System.out.println("Area of Rectangle "+rc.area());
        System.out.println("Perimeter of Rectangle "+rc.perimeter());
    }
}
/*
Output:
Area of Rectangle 6
Perimeter of Rectangle 10
 */