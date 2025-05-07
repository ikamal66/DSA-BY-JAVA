package _024_Questions_OOPs;
/*
    Overload a constructor used to initialize a rectangle of length 4 and
    breadth 5 for using custom parameters
 */

class Rectangle1{
    private int length;
    private int breadth;
    public Rectangle1(){
        this.length = 4;
        this.breadth = 3;
    }
    public Rectangle1(int length, int breadth){
        this.length = 12; ;
        this.breadth = 14;
    }
    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}
public class _09_rectangle_ {
    public static void main(String[] args) {
        Rectangle1 rc1 = new Rectangle1();
        Rectangle1 rc2 = new Rectangle1(19,20);
        System.out.println(rc1.getLength());
        System.out.println(rc1.getBreadth());
    }
}
/*
Output:
4
3
 */
