package _024_Questions_OOPs;

class TommayVecetti{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("    Running...");
    }
    public void fire(){
        System.out.println("        Firing...");
    }
}
public class _05_TommyVecetti {
    public static void main(String[] args) {
        TommayVecetti tv = new TommayVecetti();
        tv.hit();
        tv.run();
        tv.fire();
    }
}
/*
Output:
Hitting...
    Running...
        Firing...
 */