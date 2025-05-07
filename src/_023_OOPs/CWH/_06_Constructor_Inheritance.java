package _023_OOPs.CWH;

class Base1{
    public Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor with value of a "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(20); // it will print the overloaded constructor value of base class, then it not print the normal constructor value
        System.out.println("I am derived class constructor");
    }

    Derived1(int x, int y){
        super(x);
        System.out.println("The value of y is "+y);
    }
}

class GrandChild extends Derived1{
    GrandChild(int x, int y, int z){
        super(x,y);
        System.out.println("I am a grand child with value of z "+ z);
    }
}
public class _06_Constructor_Inheritance {
    public static void main(String[] args) {
//        Base1 b1 = new Base1();
//        Derived1 d1 = new Derived1();
        GrandChild gc = new GrandChild(12,13,15);

    }
}
/*
Output:
I am an overloaded constructor with value of a 12
The value of y is 13
I am a grand child with value of z 15
 */
