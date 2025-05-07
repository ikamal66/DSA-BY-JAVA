package _023_OOPs;
// Hierarchial Inheritance
class Animal2{
    void eat(){
        System.out.println("Eating the food");
    }

    void breathe(){
        System.out.println("Take Breathe for oxygen");
    }
}

class Fish2 extends Animal2{
    void swim(){
        System.out.println("Swimming in the water");
    }
}

class Mammal2 extends Animal2{
    void walk(){
        System.out.println("Walking...");
    }
}

class Bird2 extends Animal2{
    void fly(){
        System.out.println("Flying in the sky ...");
    }
}
public class _13_Hierarchial_Inheritance {
    public static void main(String[] args) {
        Mammal2 m2 = new Mammal2();
        m2.eat();
        Bird2 b2 = new Bird2();
        b2.fly();
        b2.breathe();
    }
}
/*
Output:
Eating the food
Flying in the sky ...
Take Breathe for oxygen
 */