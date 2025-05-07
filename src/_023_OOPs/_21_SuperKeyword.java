package _023_OOPs;
// Super Keyword
class Anmal{
    String color;
    Anmal(){
        System.out.println("Animal constructor is called ");
    }
}

class Hrse extends Anmal{
    Hrse(){
        super.color = "brown";
//        super(); // by using of this we called Anmal class constructor
        System.out.println("Horse constructor is called");
    }
}
public class _21_SuperKeyword {
    public static void main(String[] args) {
        Hrse h = new Hrse();
        System.out.println(h.color);
    }
}
/*
Output:
Animal constructor is called
Horse constructor is called
brown
 */
