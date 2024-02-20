package Bank;

import java.util.Scanner;

public class Account {
    private  int acc_no;
    private String name;
    private String address;
    private  String Phone;
    private  String DOB;
    protected   float balance;

    public  Account(int acc_no,String name,String Phone,String DOB){
        this.acc_no=acc_no;
        this.name=name;
        this.Phone=Phone;
        this.DOB=DOB;
    }
    public String getAddress() {
        return address;
    }

    public  static Account OpenAccount(){

        System.out.println("Enter your Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Enter your Phone: ");
        String phone=sc.next();
        System.out.println("Enter your Date of Birth: ");
        String dob=sc.next();
        return new  Account(13432,name,phone,dob);
    }
    public int getAcc_no() {
        return acc_no;
    }

    public String getDOB() {
        return DOB;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance += balance;
    }
    public void getAccountInfo(){
        System.out.println("Account Number: "+getAcc_no());
        System.out.println("Account Holder Name: "+getName());
        System.out.println("Balance: "+getBalance());
    }
}

