package _024_Questions_OOPs;
/*
    problem : Create a class cellphone with methods to print
                "ringing" , "vibrating" , "calling"...
 */
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class _02_create_class {
    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.vibrate();
        vivo.ring();
    }
}
/*
Output:
Vibrating...
Ringing...
 */