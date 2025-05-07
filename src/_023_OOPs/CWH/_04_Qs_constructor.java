package _023_OOPs.CWH;

class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
//
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public double surfaceArea(){
        return 2*Math.PI *radius*height;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(int length){
        return length;
    }

    public int getBreadth(int breadth){
        return breadth;
    }
}
public class _04_Qs_constructor {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9,12);
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        Rectangle r = new Rectangle(4,3);
        System.out.println(r.length);
        System.out.println(r.breadth);
    }
}
/*
Output:
12
9
678.5840131753953
3053.628059289279
4
3
 */