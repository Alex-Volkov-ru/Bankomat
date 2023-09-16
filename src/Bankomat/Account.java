package Bankomat;

public class Account {
    String name;
    String pin;
    String account;
    int Balance;

    public Account(String name, String pin, String account, int Balance){
        this.account = account;
        this.pin = pin;
        this.name = name;
        this.Balance = Balance;
    }
    public String GetPin(){
        return pin;
    }
    public String GetAccount(){
        return account;
    }
    public String GetName(){
        return name;
    }
    public int GetBalance(){
        return Balance;
    }
    public boolean ChangeBalance(int diff){
        int res = Balance + diff;
        if(res < 0){
            return false;
        }
        Balance = res;
        return true;
    }

}
