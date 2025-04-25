package _019_Strings;
// Find the Shortest Path
// Time Complexity = O(n)
public class _07_Question_ShortestPath {
    public static float getShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            // North
            else if(dir == 'N'){
                y++;
            }
            // West
            else if(dir == 'W'){
                x--;
            }
            // East
            else{
                x++;
            }
        }
        // Formula:
        int X2 = x*x;  // X2 means X^2
        int Y2 = y*y; // Y2 means Y^2
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN"; // These are direction
        System.out.println(getShortestPath(str));
    }
}
/*
Output:
5.0
 */
