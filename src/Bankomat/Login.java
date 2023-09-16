package Bankomat;

public class Login {
    public boolean CheckLogin(String Number, String Pin){
        Bank B = new Bank();
        try {
            B.GetAccount(Number,Pin);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
