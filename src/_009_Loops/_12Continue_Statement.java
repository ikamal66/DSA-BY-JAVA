package _009_Loops;
// Continue Statement
public class _12Continue_Statement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
/*
Output:
1
2
4
5
 */
