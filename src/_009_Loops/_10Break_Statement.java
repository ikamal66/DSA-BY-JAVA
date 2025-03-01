package _009_Loops;
// Break Statement
public class _10Break_Statement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am breaking out the loop");
    }
}
/*
Output:
1
2
3
I am breaking out the loop
 */
