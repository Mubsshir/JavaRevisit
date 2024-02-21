import Interfaces.Customer;
import Interfaces.Store;

public class Main {
    public static void main(String[] args) {
        Store SparePart=new Store();

        Customer c1=new Customer("Mubasshir");
        Customer c2=new Customer("Muzammil");
        SparePart.register(c1);
        SparePart.register(c2);
        SparePart.InviteForSale();
    }
}
