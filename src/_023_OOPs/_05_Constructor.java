package _023_OOPs;
// Constructor
public class _05_Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("kamal");
        System.out.println(s1.name);
        System.out.println(s1.getName("shefali"));

        Student1 s2 = new Student1();
    }
}

class Student1 {
    String name;
    int roll;

    Student1(String name){  // Parameterized constructor
        this.name = name;
    }

    Student1(){ // Non-parameterized Constructor
        System.out.println("Constructor is called ...");
    }

    public String getName(String name){
        return name;
    }
}
/*
Output:
kamal
shefali
Constructor is called ...
 */