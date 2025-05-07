package _023_OOPs;
// Inheritance

// Base Class || Parent class || Super class
class Animal{
    String color;
    void eat(){ // eat method / func
        System.out.println("Animal eats");
    }

    void breathe(){  //  breathe method
        System.out.println("Animal breathes");
    }
}

// Derived Class || Child Class || Sub Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Fish swims in water");
    }
}
public class _10_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
/*
Output:
Animal eats
Animal breathes
Fish swims in water
 */