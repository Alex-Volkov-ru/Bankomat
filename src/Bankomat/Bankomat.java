package Bankomat;

import java.util.Scanner;

enum BankomatState {
    Idle,
    Stopped,
    Active,

}


public class Bankomat {
    // Commands
    static String EXIT_COMMAND = "exit";
    static String LOGIN_COMMAND = "login";

    // Fields
    Scanner reader = new Scanner(System.in);
    BankomatState state = BankomatState.Stopped;

    public void Run() {
        state = BankomatState.Idle;
        while (state != BankomatState.Stopped) {
            String command = GetUserInput("Введите команду: ");

            if(command.equalsIgnoreCase(EXIT_COMMAND)){
                state = BankomatState.Stopped;
                continue;
            }
            if(command.equalsIgnoreCase(LOGIN_COMMAND)) {
                String Number = GetUserInput("Введите номер карты: ");
                String Pin = GetUserInput("Введите пин код: ");
                Login L = new Login();
                if(L.CheckLogin(Number,Pin)){
                    System.out.println("Добро пожаловать ");
                    state = BankomatState.Active;
                } else {
                    System.out.println("Не правильный пин код ");
                }
            }

        }
        reader.close();
        System.out.println("Всего Хорошего! ");
    }

    String GetUserInput(String request) {

        System.out.print(request);
        String  result = reader.next();
        return result;
    }


}
