package _006_Questions;
/*
 What will be the output of the following programs :
 public class Test {
    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + “ , ”);
        System.out.print(exp2);
    }
}
 */
public class question_1 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1);
        System.out.print(exp2);
    }
}
/*
Output:
5
4
 */
