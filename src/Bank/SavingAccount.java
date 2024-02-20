package Bank;

public class SavingAccount extends Account{

      public SavingAccount(int acc_no, String name, String Phone, String DOB) {
            super(acc_no, name, Phone, DOB);
      }

      public  void deposit(float amount){
            balance+=amount;
      }
      public void withdraw(float amount){
            setBalance(-amount);
      }
}

