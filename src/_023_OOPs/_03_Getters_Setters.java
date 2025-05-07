package _023_OOPs;
// Getters and Setters
class Pen1{
    private String color;
    private int tip ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}

public class _03_Getters_Setters {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
/*
Output:
Blue
5
 */