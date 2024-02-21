package Interfaces;

public class Customer implements Member {
    String name;

    public  Customer(String name){
        this.name=name;
    }
    public void callback(){
        System.out.println("Ok ,I will visit :"+this.name);
    }
}
