package _024_Questions_OOPs;
/*
    Problem : Create a class cylinder and use constructor to set its radius and height
 */
class Cylinder1{
    private int radius;
    private int height;
    Cylinder1(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class _08_Cylinder_usebyConstructor {
    public static void main(String[] args) {
        Cylinder1 clr = new Cylinder1(11,13);
        System.out.println(clr.surfaceArea());
        System.out.println(clr.volume());
    }
}
/*
Output:
1658.7609210954106
4941.725244096744
 */
