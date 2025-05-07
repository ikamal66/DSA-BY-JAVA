package _023_OOPs;
// Hybrid Inheritance

class Animal3{
    void eat(){
        System.out.println("Eating the food");
    }

    void breathe(){
        System.out.println("Breathing the air ");
    }
}

class Fish3 extends Animal3{
    void swim(){
        System.out.println("They are swimming under the water");
    }
}

class Bird3 extends Animal3{
    void fly(){
        System.out.println("They have power to fly in the sky");
    }
}

class Mammal3 extends Animal3{
    void walk(){
        System.out.println("They can walk ");
    }
}

class Shark3 extends Fish3{
    void big(){
        System.out.println("This is large fish in the ocean");
    }
}

class Peacock3 extends Bird3{
    void dance(){
        System.out.println("We can't compare peacock dance");
    }
}

class Dog3 extends Mammal3{
    void honest(){
        System.out.println("They are honest more honest than humans");
    }
}

class Humans extends Mammal3{
    void charater(){
        System.out.println("They are double faced persons");
    }
}
public class _14_Hybrid_Inheritance {
    public static void main(String[] args) {
        Animal3 a3 = new Animal3();
        a3.eat();

        Humans h3 = new Humans();
        h3.eat();
        h3.walk();
        h3.charater();

        Dog3 d3 = new Dog3();
        d3.honest();
        d3.walk();
        d3.breathe();
    }
}
/*
Output:
Eating the food
Eating the food
They can walk
They are double faced persons
They are honest more honest than humans
They can walk
Breathing the air
 */
