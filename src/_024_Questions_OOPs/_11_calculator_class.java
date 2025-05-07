package _024_Questions_OOPs;

class Complex{
    private int a;
    private int b;
    public int sum(int a, int b){
        return a+b;
    }

    public int diff(int a, int b){
        return a-b;
    }

    public int product(int a, int b){
        return a*b;
    }

    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }

    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
}
public class _11_calculator_class {
    public static void main(String[] args) {
        Complex calc = new Complex();
        System.out.println("Sum: "+calc.sum(4,3));
        System.out.println("Difference: "+calc.diff(4,3));
        System.out.println("Product: "+calc.product(4,3));
        calc.setA(5);
        calc.setB(2);
        System.out.println("Sum: "+(calc.getA()+calc.getB()));
        System.out.println("Difference: "+(calc.getA() - calc.getB()));
        System.out.println("Product: "+(calc.getA()*calc.getB()));
    }
}
/*
Output:
Sum: 7
Difference: 1
Product: 12
Sum: 7
Difference: 3
Product: 10
 */