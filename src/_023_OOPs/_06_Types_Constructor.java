package _023_OOPs;
// Types of Constructor
class MyStudent{
    String name;
    int roll;

    MyStudent(){
        System.out.println("It is non - parametrized constructor");
    }

    MyStudent(String name){
        System.out.println("It is a parametrized constructor");
    }

    MyStudent(String name, int roll){
        System.out.println("It is a parametrized constructor");
    }
}
public class _06_Types_Constructor {
    public static void main(String[] args) {
        MyStudent s1 = new MyStudent();
        MyStudent s2 = new MyStudent("kamal");
        MyStudent s3 = new MyStudent("kamal",490);
    }
}
/*
Output:
It is non - parametrized constructor
It is a parametrized constructor
It is a parametrized constructor
 */
