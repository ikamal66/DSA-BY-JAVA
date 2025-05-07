package _023_OOPs.CWH;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n ){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class _02_Access_modifiers {
    public static void main(String[] args) {
        MyEmployee kamal = new MyEmployee();
//        kamal.id = 490;  // we don't use of it, bcz we use access modifier
//        kamal.name = "rahu";
        kamal.setId(490);
        System.out.println(kamal.getId());
        kamal.setName("kabutar");
        System.out.println(kamal.getName());
    }
}
/*
Output:
490
kabutar
 */