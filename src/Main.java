import Bank.Account;
import Bank.SavingAccount;
import Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Account myAccount=  Account.OpenAccount();
        myAccount.getAccountInfo();
    }
}