package _024_Questions_OOPs;
// [ V = \pi r^2 h ]
// [ A = 2\pi r h + 2\pi r^2 ]  -- surface area

class Cylinder{
    int radius;
    int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class _07_Cylinder_Getter_Setter {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        cl.setRadius(11);
        cl.setHeight(13);
        System.out.println(cl.getRadius());
        System.out.println(cl.getHeight());
        System.out.println(cl.volume());
        System.out.println(cl.surfaceArea());
    }
}
/*
Output:
11
13
4941.725244096744
1658.7609210954106
 */