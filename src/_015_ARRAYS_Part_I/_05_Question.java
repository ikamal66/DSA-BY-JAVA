package _015_ARRAYS_Part_I;
import java.util.Scanner;
// Create the menu for hotel using of linear search
public class _05_Question {
    public static int searchFood(String[] menu, String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] menu = {"Sandwich", "momos", "ColdCoffee", "Chai", "Samosa","Snacks"};
        String key = "Sandwich";
        int index = searchFood(menu, key);
        if (index != -1) {
            System.out.println(key + " found at index: " + index);
        } else {
            System.out.println(key + " not found.");
        }
    }
}
/*
Output:
Sandwich found at index: 0
 */


//String[] menu = {"water", "lassi", "samosa","kachori", "matka kulfi"};
//Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name");
//String name = sc.next();
////        System.out.println(foodMenu(menu,name));
//
//int index = foodMenu(menu, name);
//        if(index == -1){
//        System.out.println("Not found");
//        }
//                else{
//                System.out.println("Found at index: "+index );
//        }
