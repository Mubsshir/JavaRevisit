package Singleton;



class CoffeMachine{
    private float waterLevel=0;
    private  float CoffieAmount=0;
    static private  CoffeMachine our=null;
    private  CoffeMachine(){
        this.CoffieAmount=2.0f;
        this.waterLevel=2.0f;
    }

    static  public CoffeMachine getInstance(){
        if(our==null){
            our=new CoffeMachine();
        }
        return  our;
    }

    public void FillCup(){
        if(this.CoffieAmount==0&&this.waterLevel==0){
            System.out.println("Please refill Coffee and Water");
            return;
        }
        if(this.waterLevel==0){
            System.out.println("Please Refill water");
            return;
        }
        if(this.CoffieAmount==0){
            System.out.println("Please Refill Coffee");
            return;
        }
        this.CoffieAmount-=1;
        this.waterLevel=-1;
        System.out.println("Coffee Cup Filled please pick it up");
    }
    public void RefillCoffee(float CoffeeAmount){
        this.CoffieAmount+=CoffeeAmount;
    }
}

public class SingletonExample {

    public static void main(String[] args) {
        CoffeMachine c=CoffeMachine.getInstance();
        c.FillCup();
        c.FillCup();

        CoffeMachine e=CoffeMachine.getInstance();
        e.FillCup();
        c.FillCup();
        e.RefillCoffee(5);
        c.FillCup();
    }
}
