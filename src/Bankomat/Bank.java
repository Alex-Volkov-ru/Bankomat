package Bankomat;

import java.util.Objects;

public class Bank {
    Account[] accounts = {
            new Account("vasia", "1111", "1234", 1000),
            new Account("Petia", "1112", "1984", 1000)
    };

    public Account GetAccount(String number,String pin) throws Exception {
        for (Account acc: accounts) {
            if(Objects.equals(number, acc.GetAccount())){
                if(Objects.equals(pin, acc.GetPin())){
                    return acc;
                }
            }
        }
        throw new Exception("Аккаунт не найден");
    }
}
