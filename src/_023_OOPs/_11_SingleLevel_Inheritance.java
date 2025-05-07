package _023_OOPs;
// Single Level Inheritance
class Animal0{
    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleep...");
    }
}

class Rabbit extends Animal0{
    public void run(){
        System.out.println("Run fast");
    }
}
public class _11_SingleLevel_Inheritance {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.sleep();
    }
}
/*
Output:
Eating...
Run fast
Sleep...
 */