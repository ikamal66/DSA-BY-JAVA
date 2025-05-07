package _023_OOPs;
// Access Modifiers
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

public class _02_AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ikamal490";
//        myAcc.password = "abcdefghi"; // we can't access directly
        myAcc.setPassword("abcdefghi");
    }
}