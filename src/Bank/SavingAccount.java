package Bank;

public class SavingAccount extends Account{
      public  SavingAccount(){
            super();
            balance=0;
      }
      public SavingAccount(int acc_no, String name, String Phone, String DOB) {
            super(acc_no, name, Phone, DOB);
      }
      public  void deposit(float amount){
            balance+=amount;
      }


      @Override
      public void withdraw(float amount){
            setBalance(-amount);
      }
      @Override
      public  void Meth2(){
            System.out.println("hello from Saving Account");
      }
}

