package Interfaces;

public class Store {
    Member[] mem =new Member[100];
    int count=0;
    public void register(Member m){
        mem[count++]=m;
    }
    public void InviteForSale(){
        for (int i = 0; i <count ; i++) {
            mem[i].callback();
        }
    }
}



