package _023_OOPs;
// Multi Level Inheritance

class Animal1{
    String color;
    void eat(){
        System.out.println("Eating the food");
    }
}

class Mammal extends Animal1{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
public class _12_MultiLevel_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        System.out.println(d.legs = 4);
        System.out.println(d.breed="Kaala kutta");
    }
}
/*
Output:
Eating the food
4
Kaala kutta
 */