package _023_OOPs.CWH;

class Base{
    int x;

    public void setX(int x){
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}

class Animal{
    public void fly(){
        System.out.println("Birds are fly");
    }
    public void cow(){
        System.out.println("Cow give us milk");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog Bark");
    }
    public void honest(){
        System.out.println("Dog are honest animals");
    }
}
public class _05_Inheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(12);
//        System.out.println(b.getX());

//        Derived d = new Derived();
//        d.setX(69);
//        System.out.println(d.getX());

        Dog d = new Dog();
        d.fly();
        d.honest();
        d.bark();
        d.cow();
    }
}
/*
Output:
Birds are fly
Dog are honest animals
Dog Bark
Cow give us milk
 */
