package _024_Questions_OOPs;
/*
    Create a class circle and use inheritance to
     create another class Cylinder from it.

     // Use of formula
     Area of Circle = pi*radius*radius
     Volume of Cylinder = pi*radius*radius*height
 */

class Circle1{
    int radius;
    int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void areaofCircle(){
        System.out.println("AreaOfCircle: "+Math.PI*radius*radius);
    }
}

class Cylinder2 extends Circle1{
    public void areaOfCylinder(){
        System.out.println("AreaOfCylinder: "+Math.PI*radius*radius*height);
    }
}
public class _10_inheritance {
    public static void main(String[] args) {
        Cylinder2 cl2 = new Cylinder2();
        cl2.setRadius(3);
        cl2.setHeight(2);
        cl2.areaofCircle();
        cl2.areaOfCylinder();
    }
}
/*
Output:
AreaOfCircle: 28.274333882308138
AreaOfCylinder: 56.548667764616276
 */