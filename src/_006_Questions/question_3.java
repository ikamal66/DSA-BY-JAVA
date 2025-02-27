package _006_Questions;
/*
 What will be the output of the following programs :
public class Test {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
 */
public class question_3 {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
/*
output:
4 0 0
 */