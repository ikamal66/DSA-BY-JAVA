package _012_Functions_and_Methods;
// Call By Value
public class _05_CallByValue {
    public static int changeA(int a){
        a = 20;
//        System.out.println(a); // If we uncomment this line the output will be 20
        return a;
    }
    public static void main(String[] args) {
        int a = 10;
        changeA(a);
//        System.out.println(a); // If we uncomment this line the output will be 'a' original value which is 10
    }
}
