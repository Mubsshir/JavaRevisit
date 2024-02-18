import Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(2,4);
        rect.setWidth(1);
        rect.setBreath(5);
        Integer area=rect.getArea();
        System.out.println("Area of Rectangle: "+area);
    }
}