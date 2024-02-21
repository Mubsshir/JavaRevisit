package InnerAndAnonymous;

class OuterClass{
    void display(String hello){
        System.out.println("Hello world");
    }
    class InnerClass{
        public int a=10;
        public void Display(){
            System.out.println("Hello World From Inner Class");
        }
    }

    public void Test(){
        InnerClass in=new InnerClass();
        in.Display();
    }

}

abstract class My{
    abstract void Display();
}
public class NestedClass {
    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        o.Test();

        //Anonymous class

        My m=new My() {
            @Override
            void Display() {
                System.out.println("Hi from anonymous class");
            }
        };

        m.Display();
    }
}
