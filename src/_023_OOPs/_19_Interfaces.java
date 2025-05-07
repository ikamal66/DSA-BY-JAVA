package _023_OOPs;
// Interfaces

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left right , diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left right");
    }
}

class King implements ChessPlayer{
    public  void moves(){
        System.out.println("up, down, left right, diagonal by 1 step");
    }
}

interface Herbivore{
     void eatGreen();

}
interface Carnivore{
    void meat();

}
class Bear implements Herbivore,Carnivore{
    public void eatGreen(){
        System.out.println("Eating green vegetables");
    }

    public void meat(){
        System.out.println("Eating meat");
    }
}
public class _19_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear bear = new Bear();
        bear.meat();
        bear.eatGreen();
    }
}
/*
Output:
up, down, left right , diagonal (in all 4 directions)
Eating meat
Eating green vegetables
 */
