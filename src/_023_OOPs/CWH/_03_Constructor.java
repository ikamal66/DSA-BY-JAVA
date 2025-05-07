package _023_OOPs.CWH;

class MyMainEmployee{
    private   int id;
    private String name;

    public MyMainEmployee(){ // constructor
        id = 465;
        name = "Your-Name";
    }

public void setName(String name ){
    this.name = name;
}
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
public class _03_Constructor {
    public static void main(String[] args) {
        MyMainEmployee kamal = new MyMainEmployee();
//        kamal.setName("Ram");
//        kamal.setId(490);
        System.out.println(kamal.getId());
        System.out.println(kamal.getName());
    }
}
/*
Output:
465
Your-Name
 */
