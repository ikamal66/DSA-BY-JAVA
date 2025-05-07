package _023_OOPs;
// Abstract Class
abstract class Animal11{
    String color;
    void eat(){
        System.out.println("Animal eats");
    }
    Animal11(){  // constructor in abstract class
        System.out.println("Animal constructor called ");
        color = "brown";
    }

    abstract void walk(); // it's an abstract
}

class Horse extends Animal11{
    Horse(){
        System.out.println("Horse Constructor called ");
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
    void changeColor(){
        color = "Dark brown";
    }
}

class Mustang extends Horse{  // grand child of Animal11
    Mustang(){
        System.out.println("Mustang constructor called ..");
    }
}

class Chicken extends Animal11{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color = "yellow";
    }
}
public class _18_AbstractClass {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//
//        Chicken ck = new Chicken();
//        ck.eat();
//        ck.walk();

//        Animal11 a = new Animal11(); // we can't made object of an abstract class

//        System.out.println(h.color);

        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}
/*
Output:
Animal constructor called
Horse Constructor called
Mustang constructor called ..
 */