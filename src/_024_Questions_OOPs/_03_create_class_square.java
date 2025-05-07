package _024_Questions_OOPs;
/*
    Problem : Create a class square with a method to initialize its
                sides ,calculating area , perimeter etc.
 */
class Square{
    int side;
    public int area(){
       return side*side;
    }
    public int perimeter(){
      return 4*side;
    }

    public void areaOfSqr(){
        System.out.println(side*side);
    }
}
public class _03_create_class_square {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        sq.areaOfSqr();
    }
}
/*
Output:
9
12
9
 */