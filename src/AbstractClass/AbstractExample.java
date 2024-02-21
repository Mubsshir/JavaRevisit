package AbstractClass;



abstract class Super{
    public void Display(){
        System.out.println("This is super class");
    }
    abstract void Message(String message);
}


 class Sub extends Super{
    @Override
    public  void Message(String message){
        System.out.println("Got the message: "+message);
    }
}
public class AbstractExample {

    public static void main(String[] args) {
        Super s1=new Sub();
        s1.Display();
        s1.Message("Work hard to get what u need");
    }
}
