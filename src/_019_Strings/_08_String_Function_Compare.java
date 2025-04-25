package _019_Strings;
// Use of .equals( )
public class _08_String_Function_Compare {
    public static void main(String[] args) {
        String str = "Kamal";
        String str1 = new String("Kamal");
        if(str == str1){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        // Here, str != str1 bcz str1 creates a new object

        if(str.equals(str1)){
            System.out.println("True");
        }
        else{
            System.out.println("Not Equal");
        }

        System.out.println();
        String str2 = "shefali";
        String str3 = "SHEFALI";
        System.out.println(str2.equals(str3)); // false
        System.out.println(str2.equalsIgnoreCase(str3)); // true
    }
}
/*
Output:
Not Equal
True

false
true
 */
