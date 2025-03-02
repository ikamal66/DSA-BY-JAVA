package _011_Pattern_Problem_Part_1;
// Character Pattern Pyramid
/*
    A
    BC
    DEF
    GHIJ
 */
public class _04Character_Pattern {
    public static void main(String[] args) {
      int num = 4;
      char ch = 'A';
      for(int i=1; i<=num; i++){
          for(int j=1; j<=i; j++){
              System.out.print(ch);
              ch++;
          }
          System.out.println();
      }
    }
}
