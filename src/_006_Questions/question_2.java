package _006_Questions;
/*
 What will be the output of the following programs :
  public class Test {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
 */
public class question_2 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
/*
Output:
Java
 */