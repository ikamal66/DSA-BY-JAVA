package _023_OOPs.CWH;

class Employee{
    int id;
    String name;
    int salary;

   public void printDetails(){
       System.out.println("My name is "+name +" and my id is "+id);
   }
   public int getSalary(){
       return salary;
   }

}
public class _01_Create_own_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our class");
        Employee kamal = new Employee();
        Employee hemant = new Employee();
        kamal.id = 490;
        kamal.name = "Aman";
        kamal.salary = 12000;
        hemant.id = 466;
        hemant.name = "Hema";
//        System.out.println(kamal.id);
//        System.out.println(kamal.name);
        kamal.printDetails();
        hemant.printDetails();
        System.out.println(kamal.getSalary());
    }
}
/*
Output:
This is our class
My name is Aman and my id is 490
My name is Hema and my id is 466
12000
 */
