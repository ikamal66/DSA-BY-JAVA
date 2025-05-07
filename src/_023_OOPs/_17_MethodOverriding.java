package _023_OOPs;
// Method Overriding
class Animal12{
    void eat(){
        System.out.println("Eat Food ");
    }

    Animal12(){
        System.out.println("constructor");
    }
}

class Deer extends Animal12{
    @Override
    void eat(){
        System.out.println("Eats Grass");
    }
}
public class _17_MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

        Animal12 a12 = new Animal12();
        a12.eat();
    }
}
/*
Output:
constructor
Eats Grass
constructor
Eat Food
 */
