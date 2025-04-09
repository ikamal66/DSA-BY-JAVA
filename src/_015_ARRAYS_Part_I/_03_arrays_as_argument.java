package _015_ARRAYS_Part_I;
// Passing arrays as argument
public class _03_arrays_as_argument {
    public static void update(int marks[], int nonChangable){
        nonChangable = 20;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
//            System.out.print(marks[i]+" ");
        }
    }
    public static void main(String[] args) {
        int marks[] = {67,45,75};
        int nonChangable = 5;
        System.out.print("Old Numbers: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.print("\nUpdated Numbers: ");
        update(marks, nonChangable);
        for(int i=0; i<marks.length; i++){  // Array of references
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("nonChangable value : "+nonChangable); // it would not change
    }
}
/*
    Arrays in Java are passed by reference
    (their memory address is passed instead of a copy of the data).

    Primitive types (like ) in Java are passed by value,
    meaning a copy is sent to the method, and changes don't reflect outside the method

    To update a primitive value inside a method,
    return the new value and assign it back in .
 */