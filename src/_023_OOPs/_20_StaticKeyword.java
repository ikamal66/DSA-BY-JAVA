package _023_OOPs;
// Static Keyword
class Student0{
    String name;
    int roll;

    static String schoolName;  // we made here static schoolName

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
public class _20_StaticKeyword {
    public static void main(String[] args) {
        Student0 s1 = new Student0();
        s1.schoolName = "JVM";

        Student0 s2 = new Student0();
        System.out.println(s2.schoolName);

        Student0 s3 = new Student0();
        s3.schoolName = "ABC";

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }
}
/*
Output:
JVM
ABC
ABC
 */