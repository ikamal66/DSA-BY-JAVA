package _023_OOPs;
// Method Overloading

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
     return a+b+c;
    }
}

public class _16_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum(2.3f,3.2f));
        System.out.println(calc.sum(2,3,5));
    }
}

/*
Output:
5
5.5
10
 */