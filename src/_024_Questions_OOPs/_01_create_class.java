package _024_Questions_OOPs;
/*
    problem :
            Create a class Employee with following properties and methods:
            salary(property)(int)
            getSalary(method returning int)
            name(property)(String)
            getName(method returning String)
            setName(method changing name)
 */
class Employee{
    public int salary;
    public int getSalary(){
        return salary;
    }
    public String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
public class _01_create_class {
    public static void main(String[] args) {
        Employee ep = new Employee();
        ep.setName("kamal");
        System.out.println(ep.getName());

        ep.salary = 12000;
        System.out.println(ep.salary);
    }
}
/*
Output:
kamal
12000
 */