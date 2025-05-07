package _023_OOPs;
// copy constructor, shallow and DeepCopy constructor
class Students{
    String name;
    int roll;
    String password;
    int[] marks;

    // shallow copy constructor
//    Students(Students s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    // deep copy constructor
    Students(Students s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Students(){
        marks = new int[3];
    }
    Students(String name){
        marks = new int[3];
    }
    Students(int roll){
        marks = new int[3];
    }
}
public class _07_CopyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "LION";
        s1.roll = 490;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        System.out.println(s1.password);
    }
}
/*
Output:
When we run shallow copy constructor:
100
90
100
LION
490
xyz
abcd
 */

/*
When we run Deep copy constructor:
100
90
80
LION
490
xyz
abcd

 */