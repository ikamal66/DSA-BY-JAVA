package _010_QuestionsOnLoops;
/*
What is wrong in the following program?
public class Solution {
  public static void main (String args[] ) {
    for(int i = 0; i <= 5; i++) {
      System.out.println("i = " + i);
    }
    System.out.println("i after the loop = " + i);
  }
}
 */

public class _05Question {
    public static void main(String[] args) {
//        for(int i = 0; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//        System.out.println("i after the loop = " + i); // Here, i is not initialized
    }
}

/*
Error output!
java: cannot find symbol
  symbol:   variable i
 */
