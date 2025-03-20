package _012_Functions_and_Methods;
// Print Prime numbers in between the range
import java.util.Scanner;

public class _15_PrintAllPrimes_range {
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
          for(int i=2; i<=Math.sqrt(number); i++){
           if(number%i==0){
               return false;
           }
        }
          return true;
    }

    public static void primeInRange(int number){
        for(int i=2; i<=number; i++){
//            if(!isPrime(i)){ --> it will give all the non-prime numbers
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        primeInRange(num);
    }
}
/*
Output:
Enter number
50
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 */